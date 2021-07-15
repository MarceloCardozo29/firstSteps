package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {  
		
		// Double a = 1;  aqui da erro
		// Java não permite converter int (tipo primitivo) -> Double (classe Double) --- JA VIMOS ISSO
		//Double b = 1.0; aqui não da erro
		//Java permite converter double (tipo primitivo) ->  Double (classe Double) --- JA VIMOS ISSO
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y;	};      
		System.out.println(calc.apply(2.0, 3.0));
		
			
		calc = (x, y) -> x * y;          
		System.out.println(calc.apply(2.0, 3.0));
		
		// OUUUUUUUUUUUUUU ao invés de Double coloca Integer
		
		
		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;	};      
		System.out.println(calc2.apply(2, 3));
		
			
		calc = (x, y) -> x * y;          
		System.out.println(calc2.apply(2, 3));
		
		}
				
	}


