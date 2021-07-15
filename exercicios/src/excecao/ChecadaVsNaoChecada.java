package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) throws Exception {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}

	// Exce��o N�o checada ou N�o verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu o erro tal #01"); // lance um erro do tipo RuntimeException com a seguinte mensagem...
	}                                                         // RuntimeException � filha de Exception
	
	// Exce��o checada ou verificada
	static void geraErro2() throws  Exception {
	    throw new Exception ("Ocorreu o erro tal #02");  //lance uma excec�o  com a seguinte mensagem
	}

	}

