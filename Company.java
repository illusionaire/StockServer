import java.util.*;

public class Company {
	String name;
	List<String> positiveWords;
	Set<String> positiveArticles;
	List<String> negativeWords;
	Set<String> negativeArticles;

	/**
	public Company(String name, ArrayList<String> positiveWords, Set<String> positiveArticles, ArrayList<String> negativeWords, Set<String> negativeArticles) {
		this.name = name;
		this.positiveWords = positiveWords;
		this.positiveArticles = positiveArticles;
		this.negativeWords = negativeWords;
		this.negativeArticles = negativeArticles;
	}
	**/

	public Company(String name) {
		this.name = name;
		this.positiveWords = new ArrayList<>();
		this.positiveArticles = new HashSet<>();
		this.negativeWords = new ArrayList<>();
		this.negativeArticles = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public List<String> getPositiveWords() {
		return positiveWords;
	}

	public void addPositiveWord(String word) {
		this.positiveWords.add(word);
	}

	public void addPositiveWords(List<String> words) {
		this.positiveWords.addAll(words);
	}

	public Set<String> getPositiveArticles() {
		return positiveArticles;
	}

	public void addPositiveArticle(String article) {
		this.positiveArticles.add(article);
	}

	public void addPositiveArticles(Set<String> articles) {
		this.positiveArticles.addAll(articles);
	}

	public List<String> getNegativeWords() {
		return negativeWords;
	}

	public void addNegativeWord(String word) {
		this.negativeWords.add(word);
	}

	public void addNegativeWords(List<String> words) {
		this.negativeWords.addAll(words);
	}

	public Set<String> getNegativeArticles() {
		return negativeArticles;
	}

	public void addNegativeArticle(String article) {
		this.negativeArticles.add(article);
	}

	public void addNegativeArticles(Set<String> articles) {
		this.negativeArticles.addAll(articles);
	}
}