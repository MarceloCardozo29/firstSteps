package colecoes;


//ESTAMOS USANDO A CLASSE USUARIO E LÁ TEM EQUALS E HASHCODE
import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
			usuarios.add(new Usuario("Pedro"));
			usuarios.add(new Usuario("Ana"));
			usuarios.add(new Usuario("Jose"));
			
			boolean resultado = usuarios.contains(new Usuario("Jose"));
			System.out.println(resultado);
			
	}

}
