package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		
		Aluno a1 = null;
		
		try { imprimirNomeDoAluno(a1);
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usu�rio");
		}
		
		
		try {
			System.out.println(7 / 0);                  // aqui da erro de aritmetica - seleciona + bot�o direito mouse + Surround with - try/catch dai aparece a forma mais generica
		} catch (ArithmeticException e) {                        // fui la na mensagem de excecao e peguei a informa��o e colei aqui  estava Exception e coloquei ArithmeticException
				System.out.println("Ocorreu o erro: " + e.getMessage());         // aqui pegou a informa��o que dizia o erro que � divis�o por zero ou / by zero
		}   
		
		System.out.println("Fim:)");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome); 
	}
}
