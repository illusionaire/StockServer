import java.util.*;

public class ArticleAnalyzer {
	Dictionary dictionary;

	public ArticleAnalyzer() {
		dictionary = new Dictionary();
	}

	public ArrayList<Company> analyzeArticles(HashMap<String, String> articleTitlesAndUrls) {
		Map<String, Company> companies = new HashMap<>();
		for (Map.Entry pair : articleTitlesAndUrls.entrySet()) {
			Company company = getAnalysis(pair);
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

	public Company getAnalysis(Map.Entry pair) {
		ArrayList<String> positiveWords = new ArrayList<>();
		ArrayList<String> negativeWords = new ArrayList<>();
		Company company = new Company(getName(pair.getValue()));
		//analyze based on pair.getKey()
		for (String s : pair.getKey().split(" ")) {
			
		}

		if (!positiveWords.isEmpty()) {
			company.addPositiveArticle(pair.getValue());
		}
		if (!negativeWords.isEmpty()) {
			company.addNegativeArticle(pair.getValue());
		}
	}

	public String getName(String articleTitle) { //regex matching on TheFool.com using regex ".*(\([A-Z]+?:[A-Z]+?\)).*" and Matcher.group(1)
		return "";
	}
}