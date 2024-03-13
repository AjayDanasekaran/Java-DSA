package RegularExpression;

import java.util.regex.*;
public class Regex2 {
	public static void main(String[] args) {
		String date = "Date: 2023-01-01";
		Pattern p = Pattern.compile("Date: (\\d{4}-\\d{2}-\\d{2})");
		Matcher m = p.matcher(date);
		if(m.matches()) {
			System.out.println(m.group());
		}
		
		String input = "123456";
		Pattern greedyPattern = Pattern.compile("\\d.*\\d");
		Pattern lazyPattern = Pattern.compile("\\d.*?\\d");

		Matcher greedyMatcher = greedyPattern.matcher(input);
		Matcher lazyMatcher = lazyPattern.matcher(input);

		if (greedyMatcher.find()) {
		    System.out.println("Greedy Match: " + greedyMatcher.group());
		}

		if (lazyMatcher.find()) {
		    System.out.println("Lazy Match: " + lazyMatcher.group());
		}
		
		

	}
}
