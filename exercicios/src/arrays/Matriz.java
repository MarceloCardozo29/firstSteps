package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("QUantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("QUantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {                          // for mais externo percorre os alunos que é o array mais externo
			for (int n = 0; n < notasDaTurma[a].length; n++) {                  // for interno percorre as notas que é o array interno
				
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
			
		}
		
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Media da turma é " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {                             // para percorrer o array interno
			System.out.println(Arrays.toString(notasDoAluno));
			
		}
		entrada.close();
		
	}

}
