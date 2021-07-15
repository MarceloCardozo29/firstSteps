package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {  // s� olhar l� em calculo pra ver como est� l� pra implementar, l� tem s� um comportamento que � o executar
		
		//preciso receber dois parametros, double a e double b que aqui � o x e  y -- so olhar na Interface Calculo o que foi definido l�
		Calculo calc = (x, y) -> {return x + y;	};       // essa � um lambda expression ou func�o lambda
		System.out.println(calc.executar(2, 3));
		
		
		
		calc = (x, y) -> x * y;           // QUANDO N�O COLOCAMOS CHAVES, AUTOMATICAMENTE O QUE FOI POSTO DEVER� SER RETORN�VEL
		System.out.println(calc.executar(2, 3));
		
		}
				
	}


