package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class criandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;                   // :: referencia para método, daí eu só preciso chamar o print (nesse caso)
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");    // 1 forma de criar Stream
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n"};       //Array
		
		Stream.of(maisLangs).forEach(print);                     // segunda forma de criar Stream - criei a partir de um array
		Arrays.stream(maisLangs).forEach(print);                // terceira forma de criar Stream - criei a partir de um array
		Arrays.stream(maisLangs, 1, 2).forEach(print);         //outra forma de criar Stream, mas aqui percorreu os elementos de índice 1 e 2 do array mas não mostrou o elemento de indice 2
		
		List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin ");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);             // dados foram processados paralelamentes 
		
	              //generate gera uma Stream sem ordenação e potencialmente infinita 
		//Stream.generate(() -> "a").forEach(print);
		   
		Stream.iterate(0, n -> n + 1).forEach(println);  // gera um Stream infinito já que vai somando mais  1 ao numero sem fim
		// semente inicial foi 0 daí fez: 0+1=1 depois 1+1=2 e por aí vai...
		
	}


}
