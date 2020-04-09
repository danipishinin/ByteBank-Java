package teste;

import java.io.FileWriter;
import java.io.IOException;


public class TesteIOHigh {
	
	public static void main(String[] args) throws IOException {
		
		String newLine = System.lineSeparator();
		
		FileWriter out = new FileWriter("teste.txt");
		out.write("Lorem ipsum ");
		out.write(newLine);
		out.write("Olá,");

		out.close();
	}
}
