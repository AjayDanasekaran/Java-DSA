package RegularExpression;

import java.util.regex.*;

public class Regex1 {
	public static void main(String[] args) {
//		Creating a Regular Expression
		String regex = "pattern";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("input String");
		
//		Email matching pattern
//		String emailPattern = "[a-zA-Z0-9._]+\\@[a-zA-Z]+\\.[a-z]{2,3}";
//		Pattern email = Pattern.compile(emailPattern);
//		String mailid = "ajaydana99@gmail.com";
//		Matcher match = email.matcher(mailid);
//		if (match.matches()) {
//            System.out.println("Valid email address: " + match.group());
//        } else {
//            System.out.println("Invalid email address");
//        }
		
//		Phone number indian matching
//		String phonePattern = "\\+91[0-9]{10}";
//		Pattern phone = Pattern.compile(phonePattern);
//		String num = "+919345495727";
//		Matcher numatch = phone.matcher(num);
//		if (numatch.matches()) {
//            System.out.println("Valid Phone number: " + numatch.group());
//        } else {
//            System.out.println("Invalid Phone number");
//        }
	}
}
