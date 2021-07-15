package classe;

public class Usuario {
	
	String nome;
	String email;
	
	 public boolean equals(Object objeto) {    //Object � a classe m�e, � como se fosse ad�o, todo os outros vem depois dela, s�o descendentes, ela � primordial - topo da ierarquia
		 
		 if (objeto instanceof Usuario) {
			 Usuario outro = (Usuario) objeto; // est� convertendo o objeto em Usuario, fez um cash
			 
			 boolean nomeIgual = outro.nome.equals(this.nome);
			 boolean emailIgual = outro.email.equals(this.email);
			 
			 return nomeIgual && emailIgual;
		 }	else {
			 return false;
		 }
	}
	 
	 // O hashcode ser� abordado em outra aula
	 public int hashcode() {
		 return 0;
	 }
}
	
	
