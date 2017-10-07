import java.utils.*;
public class Dictionary() {
	private Set<String> websites;
	private Set<String> buzzwords;

	public Dictionary() {
		websites = new HashSet<>();
		buzzwords = new HashSet<>();
	}

	public Set<String> getWebsites() {
		return this.websites;
	}

	public Set<String> getBuzzwords() {
		return this.buzzwords;
	}
}