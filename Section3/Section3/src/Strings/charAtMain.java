//charAt() methods
package Strings;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class charAtMain {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String & index you would like to access?");
		charAt(sc.next(),sc.nextInt());
	}
	
	public static char[] tocharArray(String s) throws IOException {
		FileWriter fw = new FileWriter("char.txt");
		fw.write(s);
		fw.close();
		
		FileReader fr = new FileReader("char.txt");
		char ch[] = new char[s.length()];
		int c=0,k=0;
		while((c=fr.read())!=-1) {
			ch[k] = (char)c;
			k++;
		}
		return ch;
	}
	
	public static void charAt(String s,int index) throws IOException {
		char c[] = tocharArray(s);
		System.out.println(c[index]);
	}
}
