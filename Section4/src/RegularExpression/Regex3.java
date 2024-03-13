package RegularExpression;
import java.util.regex.*;
public class Regex3 {
	public static void main(String[] args) {
		String input = "Start of the line\nAnother line\nEnd of the line";
		Pattern pattern = Pattern.compile("^Start.*line$", Pattern.DOTALL);
		Matcher matcher = pattern.matcher(input);

		if (matcher.find()) {
		    System.out.println("Match: " + matcher.group());
		}

	}
}
