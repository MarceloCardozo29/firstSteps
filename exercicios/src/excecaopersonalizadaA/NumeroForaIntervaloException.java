package excecaopersonalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {           // ctrl + 1 + SuppressWarning
	
	
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
		public String getMessage() {
			return String.format("O atributo '%s' est� fora de intervalo ", nomeDoAtributo);	
		}
}
