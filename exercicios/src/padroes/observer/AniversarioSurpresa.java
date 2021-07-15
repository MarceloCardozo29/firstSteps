package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			
		System.out.println("Surpresa via lambda!");   // e é o nome do eventosim
		System.out.println("Ocorreu em: " + e.getMomento());      // inseri a data e hora na resposta
		
		
		});
		porteiro.monitorar();
	}

}
