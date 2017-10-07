import java.utils.*;

public class Dictionary() {
	private Set<String> websites;
	private Set<String> buzzwords;

	public Dictionary() {
		websites = new HashSet<String>(getAllWebsites());
		positiveBuzzwords = new HashSet<String>(getAllBuzzwords());
		negativeBuzzwords = new HashSet<String>(getAllNegativeBuzzwords());
	}

	public Set<String> getWebsites() {
		return this.websites;
	}

	public Set<String> getPositiveBuzzwords() {
		return this.positiveBuzzwords;
	}

	public Set<String> getNegativeBuzzwords() {
		return this.negativeBuzzwords;
	}

	public List<String> getAllWebsites() {
		return Arrays.asList("https://www.nytimes.com/topic/subject/stocks-and-bonds",
							 "https://www.fool.com/",
							 "https://www.nytimes.com/topic/organization/new-york-stock-exchange",
							 "http://www.msn.com/en-us/money/investing");
	}

	public List<String> getAllPositiveBuzzwords() {
		return Arrays.asList("increas\\w*", "rising", "boom\\w*", "jump\\w*", "surg\\w*", "rose", "popped", "climb\\w*", "trend\\w*", "soar\\w*",
			"\\w*rocket\\w*", "high", "marched", "catapulted", "rall\\w*", "revers\\w*", "better", "stabl\\w*", "roar\\w*", "leap\\w*");

	}

	public List<String> getAllNegativeBuzzwords() {
		return Arrays.asList("decreas\\w*", "slides", "drop\\w*", "bankrupt\\w*", "crash\\w*", "sank", "sink\\w*", "tumbl\\w*", "plung\\w*");
	}
}