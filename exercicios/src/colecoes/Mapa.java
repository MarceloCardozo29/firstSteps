package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");         //put coloca, se já tiver remove o anterior e coloca o novo
		usuarios.put(20, "Robson");
		usuarios.put(3, "Robertinho");
		usuarios.put(4, "Ruan");
		
		
		System.out.println(usuarios.size());    // mostra o tamanho
		System.out.println(usuarios.isEmpty());    // retorna true ou false 
		
		System.out.println(usuarios.keySet());      // mostra só as chaves
		System.out.println(usuarios.values());     // mostra só os valores(nomes nesse caso)
		System.out.println(usuarios.entrySet());   // mostra as chaves e os valores
		
		
		System.out.println(usuarios.containsKey(20));          // se tiver a chave 20 retorna true senão  false
		System.out.println(usuarios.containsValue("Ruan"));    // se tiver o valor ruan retorna true senão false
		
		System.out.println(usuarios.get(3));            // retorna o valor da chave 3
		
		// FOR PARA PERCORRER AS CHAVES
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
			
		}
		
		// FOR PARA PERCORRER OS VALORES
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//FOR PARA PERCORRER AS CHAVES E OS VALORES
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " =>> ");
			System.out.println(registro.getValue());
			
		}
		
	} 
	

}
