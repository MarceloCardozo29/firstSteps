package arrays;

import java.util.Scanner;


public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		                                                            // informar as notas com vírgula devido a configuração da minha máquina
		int qtdeNotas = entrada.nextInt();
		
		double [] notas = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
			
		}
		
		double total = 0;
		for(double nota: notas) {           //for each
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é " +  media + "!");
				
		entrada.close();
	}

}
