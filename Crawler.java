import java.util.*;
// import org.jsoup.*;
// import org.jsoup.helper.*;
// import org.jsoup.nodes.*;
// import org.jsoup.select.*;

public class Crawler {
  private HashMap<String, String> stockArticles = new HashMap<String, String>();
  // private Document htmlDocument;
  // private Elements linksOnPage;
  private static final int MAX_PAGES_TO_SEARCH = 10;

  //5 ARTICLES OF TODAY THAT DEAL WITH STOCKS
	public void search(String url) {
    // Connection connection = Jsoup.connect("https://www.fool.com/market-movers/");
    // Document htmlDocument = connection.get();
    // this.htmlDocument = htmlDocument;
    // System.out.println("Received web page at " + url);
    // Elements linksOnPage = htmlDocument.select("h4");
    // for (Element link : linksOnPage) {
    //   System.out.println(link.text());
    // }
    // System.out.println("Found (" + linksOnPage.size() + ") links");
    System.out.println("Received web page at " + url);
  }
}
