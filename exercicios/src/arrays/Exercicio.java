package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));  //Arrays quando é criado se não for dado valor ele é gerado com o valor 0.0
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;   // Java transforma um Int para double sem perda de valor quando o valor é cheio ou exato
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[2]);            // imprimi o valor que está no array na posição 2
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++){           // notasAlunoA.length pq se mudar o tamanho do Array não vai ter problema
			totalAlunoA += notasAlunoA[i];                          // essa variável i está visível apenas dentro do escopo da variável for
	}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		// outra forma de inicializar um array
		
		double [] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++){  
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}	
}
