var express = require('express');
var router = express.Router();
var cheerio = require('cheerio');
var axios = require('axios');
var url = require('url');


/* GET home page. */
router.get('/stockinformation', function(req, res, next) {
  var mainUrl = 'https://www.fool.com/market-movers/';
  var articles = {};
  axios.get(mainUrl)
    .then(({data}) => {
      var $ = cheerio.load(data);
      var promiseArray = $('h4 a').toArray().map(e => {
        if (articles["titles"] === undefined) {
          articles["titles"] = [];
          articles["titles"].push($(e).text().trim());
        } else {
          articles["titles"].push($(e).text().trim());
        }
        var resolvedURL = url.resolve(mainUrl, $(e).attr('href'));
        if (articles["urls"] === undefined) {
          articles["urls"] = [];
          articles["urls"].push(resolvedURL);
        } else {
          articles["urls"].push(resolvedURL);
        }
        return axios.get(resolvedURL);
      })
      return Promise.all(promiseArray);
    })
    .then((responses) => {
      //after you get the links, go to them and get data
      responses.map(response => {
        var body = response.data;
        var $ = cheerio.load(body);
        if (articles["companyNames"] === undefined) {
          articles["companyNames"] = [];
          articles["companyNames"].push($('.ticker a').text().trim());
        } else {
          articles["companyNames"].push($('.ticker a').text().trim());
        }
      })
    })
    .then(() => {
      res.json(articles);
    })
    .catch((error) => {
      console.log('Error', error);
    })
});

module.exports = router;
