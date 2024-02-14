package modulo_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists_Module_10 {
 //list->homogenea, ordenada, inicia vazia, cada elemento ocupa um nó, 
//tamanho variavel, inserção e deleção fácil, acesso sequencial
	
	public static void main(String[] args) {
		List <String> nameList = new ArrayList<>();
		
		nameList.add("Sara");
		nameList.add("Adelane");
		nameList.add("Maria");
		nameList.add("Flora");
		nameList.add("Samuel");
		nameList.add("Victoria");
		nameList.add("Gloria");
		
		
		nameList.add(2, "Júlia");
		
		nameList.remove(6);
		nameList.remove("Gloria");
		
		
		
		for (String name : nameList) {
			System.out.println(name);
		}
		
		System.out.println("---------------------------------");
		
		nameList.removeIf(name -> name.charAt(0) == 'M');
		
		for (String name : nameList) {
			System.out.println(name);
		}
		
		System.out.println("Sara: " + nameList.indexOf("Sara"));
		
		List<String> result = nameList.stream().filter(name -> name.charAt(0) == 'S').collect(Collectors.toList());
		
		System.out.println("---------------------------------");
		
		for (String name : result) {
			System.out.println(name);
		}
		
		
		System.out.println("---------------------------------");
		
		String firstName = nameList.stream().filter(name -> name.charAt(0) == 'S').findFirst().orElse(null);
		
		System.out.println(firstName);
	}
	
}
