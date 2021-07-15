package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Babi", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		// Predicate recebe parametro e retorna verdadeiro ou falso
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);  // implementei aqui pra usar ali embaixo no reduce
		
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);             // implementei aqui pra usar ali embaixo no reduce
		
		   // REDUCE TEM 3 FORMAS DE USAR                                                                 // reduce nesse caso tem 3 parametros, valor inicial, acumulador e combinador
		Media media = alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(new Media(), calcularMedia, combinarMedia);
		 //pegue o stream dos alunos, filtre  os aprovados, faça o mapeamento de todas as notas e no final calcule a média                
		
		System.out.println("A média do aluno é " + media.getValor());
	} 
	
			

}
