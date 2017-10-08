import java.util.*;

public class ArticleAnalyzer {
	Dictionary dictionary;

	public ArticleAnalyzer() {
		dictionary = new Dictionary();
	}

	public ArrayList<Company> analyzeArticles(HashMap<String, String> articleTitlesAndUrls) {
		Map<String, Company> companies = new HashMap<>();
		//for (Map.Entry pair : articleTitlesAndUrls.entrySet()) {
			Company company = getAnalysis(String name, String title, String url);
			if (companies.containsKey(company.getName())) {
				Company original = companies.get(company.getName());
				company.addPositiveWords(original.getPositiveWords());
				company.addPositiveArticles(original.getPositiveArticles());
				company.addNegativeWords(original.getNegativeWords());
				company.addNegativeArticles(original.getNegativeArticles());
				companies.put(company.getName(), company);
			}
			companies.put(company.getName(), company);
		}
		return companies.values();
	}

	public Company getAnalysis(String name, String title, String url) {
		ArrayList<String> positiveWords = new ArrayList<>();
		ArrayList<String> negativeWords = new ArrayList<>();
		Company company = new Company(name);
		for (String s : title.split(" ")) {
			if (dictionary.containsPositive(s)) {
				positiveWords.add(s.toLowerCase());
			}
			if (dictionary.containsNegative(s)) {
				negativeWords.add(s.toLowerCase());
			}
		}
		if (!positiveWords.isEmpty()) {
			company.addPositiveArticle(url);
		}
		if (!negativeWords.isEmpty()) {
			company.addNegativeArticle(url);
		}
		return company;
	}
}