package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {  // só olhar lá em calculo pra ver como está lá pra implementar, lá tem só um comportamento que é o executar
		
		//preciso receber dois parametros, double a e double b que aqui é o x e  y -- so olhar na Interface Calculo o que foi definido lá
		Calculo calc = (x, y) -> {return x + y;	};       // essa é um lambda expression ou funcão lambda
		System.out.println(calc.executar(2, 3));
		
		
		
		calc = (x, y) -> x * y;           // QUANDO NÃO COLOCAMOS CHAVES, AUTOMATICAMENTE O QUE FOI POSTO DEVERÁ SER RETORNÁVEL
		System.out.println(calc.executar(2, 3));
		
		}
				
	}


