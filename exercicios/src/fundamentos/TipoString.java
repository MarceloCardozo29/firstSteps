package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá people".charAt(2)); // letra acentuada
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));                                                  // %s = string
		System.out.println(s.equalsIgnoreCase("boa tarde"));                                                      // %d = valores inteiros
		                                                                                                          // %f = ponto flutuante, no nosso caso %.2f. limitou a duas casas decimais nesse caso
		var nome = "Marcelo";                                                                                     // %n = quebra de linha 
		var sobrenome = "Cardozo"; 
		var idade = 37;
		var salario = 12547.54;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");   // \n - significa que vai pra linha debaixo
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);   // .2 duas casas decimais
		
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
