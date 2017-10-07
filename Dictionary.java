import java.utils.*;
public class Dictionary() {
	private Set<String> websites;
	private Set<String> buzzwords;

	public Dictionary() {
		websites = new HashSet<String>(getAllWebsites());
		buzzwords = new HashSet<String>(getAllBuzzwords());
	}

	public Set<String> getWebsites() {
		return this.websites;
	}

	public Set<String> getBuzzwords() {
		return this.buzzwords;
	}

	public List<String> getAllWebsites() {
		return Arrays.asList("https://www.nytimes.com/topic/subject/stocks-and-bonds",
							 "https://www.fool.com/",
							 "https://www.nytimes.com/topic/organization/new-york-stock-exchange",
							 "http://www.msn.com/en-us/money/investing");
	}

	public List<String> getAllBuzzwords() {
		return Arrays.asList();
	}
}