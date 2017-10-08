import java.util.*;
import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Crawler {

  private static final int MAX_PAGES_TO_SEARCH = 10;

  //5 ARTICLES OF TODAY THAT DEAL WITH STOCKS
	public ArrayList<String> search(String url) {
    Pattern msnPattern = Pattern.compile(".*msn.com.*");
    Pattern foolPattern = Pattern.compile(".*fool.com.*");
    Matcher foolMatcher = foolPattern.matcher(url);
    Matcher msnMatcher = msnPattern.matcher(url);

    ArrayList<String> stockArticles = new ArrayList<String>();
    if (foolMatcher.matches()) {
      Connection connection = Jsoup.connect("https://www.fool.com/market-movers/");
      try {
        Document htmlDocument = connection.get();
        Elements linksOnPage = htmlDocument.select("h4");
        for (Element link : linksOnPage) {
          stockArticles.add(link.text());
        }
      }
      catch (IOException e) {
        System.out.println(e);
      }
    } else if (msnMatcher.matches()) {
      Connection connection2 = Jsoup.connect("http://www.msn.com/en-us/money/investing");
      try {
        Document htmlDocument2 = connection2.get();
        Elements linksOnPage2 = htmlDocument2.select("h3");
        for (Element link : linksOnPage2) {
          stockArticles.add(link.text());
        }
      }
      catch (IOException e) {
        System.out.println(e);
      }
    } else {
      Connection connection3 = Jsoup.connect("https://www.nytimes.com/topic/organization/new-york-stock-exchange");
      try {
        Document htmlDocument3 = connection3.get();
        Elements linksOnPage3 = htmlDocument3.select("h2");
        for (Element link : linksOnPage3) {
          stockArticles.add(link.text());
        }
      }
      catch (IOException e) {
        System.out.println(e);
      }
    }
    return stockArticles;
  }
}
