package classe;

public class Usuario {
	
	String nome;
	String email;
	
	 public boolean equals(Object objeto) {    //Object é a classe mãe, é como se fosse adão, todo os outros vem depois dela, são descendentes, ela á primordial - topo da ierarquia
		 
		 if (objeto instanceof Usuario) {
			 Usuario outro = (Usuario) objeto; // está convertendo o objeto em Usuario, fez um cash
			 
			 boolean nomeIgual = outro.nome.equals(this.nome);
			 boolean emailIgual = outro.email.equals(this.email);
			 
			 return nomeIgual && emailIgual;
		 }	else {
			 return false;
		 }
	}
	 
	 // O hashcode será abordado em outra aula
	 public int hashcode() {
		 return 0;
	 }
}
	
	
