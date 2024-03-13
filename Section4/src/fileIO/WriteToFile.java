package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
//		Writing to a file using try-with statement
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Greet.txt"))) {
			writer.write("Hello, this is Ajay");
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		
//		Reading to a file using try-with statement
		try (BufferedReader reader = new BufferedReader(new FileReader("Greet.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
