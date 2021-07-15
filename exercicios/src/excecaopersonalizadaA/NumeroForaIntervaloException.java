package excecaopersonalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {           // ctrl + 1 + SuppressWarning
	
	
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
		public String getMessage() {
			return String.format("O atributo '%s' está fora de intervalo ", nomeDoAtributo);	
		}
}
