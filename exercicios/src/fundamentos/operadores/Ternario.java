package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		String resultado = media >= 7.0 ? "aprovado" : "em recupera��o";   // ? Separa a express�o dos valores e o : separa os valores se caso for verdadeira e se caso for falsa
		
		System.out.println(" O Aluno est�: " + resultado);
	}

}
