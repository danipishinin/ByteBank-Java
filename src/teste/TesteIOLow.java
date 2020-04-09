package teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteIOLow {
	
	public static void main(String[] args) throws IOException{
		
		// ***************************LEITURA *****************************
		// lê bytes ou escreve
		InputStream fis = System.in; // new FileInputStream("teste.txt");
		// transformando bytes em caracteres
		Reader isr = new InputStreamReader(fis);
		// instanciando o buffer para ler a linha inteira
		BufferedReader br = new BufferedReader(isr);
	
		// ***************************ESCRITA *****************************
		
		OutputStream fos =  new FileOutputStream("teste.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while(linha !=null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		br.close();
		bw.close();
		
	}
}
