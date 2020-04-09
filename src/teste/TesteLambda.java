package teste;

import java.util.ArrayList;
import java.util.List;

public class TesteLambda {
			
	 public static void main(String[] args) {
		 
            List<String> nomes = new ArrayList<>();
            nomes.add("Super Mario");
            nomes.add("Yoshi"); 
            nomes.add("Donkey Kong"); 

            nomes.forEach((nome) -> System.out.println(nome));
 }
}




