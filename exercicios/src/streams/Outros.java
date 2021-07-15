package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Gabisleide", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
	
		System.out.println("distinct...");                    // não imprimi os repetidos  // isso é uma função
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");                // isso é uma função
		alunos.stream()
		.distinct()           // não imprimi os repetidos
		.skip(2)              // pulou os 2 primeiros elementos 
		.limit(2)             // limitou o resultado a 2 elementos só
		.forEach(System.out::println);
		
	
		System.out.println("\ntakeWhile");        // pegue elementos enquanto determinada condição         
		alunos.stream()
		.distinct() 
		.takeWhile(a -> a.nota >= 7)              // pegou so a Ana pq a seguinte a Luna tinha nota menor que 7, se a nota dela fosse maior que 7 iria pegar tbem, ia ir indo até parar em alguma nota menor que 7         
		.forEach(System.out::println);
		
	}
}
