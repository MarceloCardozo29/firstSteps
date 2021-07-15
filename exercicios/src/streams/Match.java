package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.2);
		Aluno a3 = new Aluno("Babi", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));    //falso pois a Luna n�o passou
		System.out.println(alunos.stream().anyMatch(aprovado));   //verdadeiro
		System.err.println(alunos.stream().noneMatch(reprovado));
		
		
		
	}

}