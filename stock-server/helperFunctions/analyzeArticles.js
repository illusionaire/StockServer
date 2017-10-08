"use strict";

function analyzeArticles(articles) {
  var companies = {};
  for (var i = 0; i < Object.keys(articles).length; i++) {
    var company = getAnalysis(articles["companyNames"][i], articles["titles"][i], articles["urls"][i]);
    if (company.hasOwnProperty(company["name"])) {
      var original = companies[company["name"]];
      if (original !== undefined) {
        var newPosWords = company["positiveWords"].concat(original["positiveWords"]);
        var newPosArticles = company["positiveArticles"].concat(original["positiveArticles"]);
        var newNegWords = company["negativeWords"].concat(original["negativeWords"]);
        var newNegArticles = company["negativeArticles"].concat(original["negativeArticles"]);
        company["positiveWords"] = newPosWords;
        company["positiveArticles"] = newPosArticles;
        company["negativeWords"] = newNegWords;
        company["negativeArticles"] = newNegArticles;
      }
    }
    if (companies[company["name"]] === undefined) {
      companies[company["name"]] = [];
      companies[company["name"]].push(company);
    } else {
      companies[company["name"]].push(company);
    }
  }
}


function getAnalysis(name, title, url) {
  var positiveWords = [];
  var negativeWords = [];
  var company = {};
  company["name"] = name;
  var titleArr = title.split('');
  for (var i = 0; i < titleArr.length; i++) {
    str.match("increas\w*|rising|boom\w*|jump\w*|surg\w*|rose|popped|climb\w*|trend\w*|soar\w*|\w*rocket\w*|high|marched|catapulted|rall\w*|revers\w*|better|stab\w*|roar\w*|leap\w*")
  }



  company["positiveWords"] = positiveWords;
  company["negativeWords"] = negativeWords;
  company["positiveArticles"] = [];
  company["negativeArticles"] = [];
}
