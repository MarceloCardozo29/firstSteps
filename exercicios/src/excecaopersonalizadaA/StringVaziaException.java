package excecaopersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {           // ctrl + 1 + SuppressWarning
	
	
	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
		public String getMessage() {
			return String.format("O atributo '%s' est� vazio ", nomeDoAtributo);	
		}
}
