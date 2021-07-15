package oo.heranca.desafio;

//A classe pai n�o tem mais o construtor padr�o pois foi alterado, agora precisa definir um construtor, esta dando erro
public class Ferrari extends Carro implements Esportivo, Luxo {       // implemets significa que implementa uma interface
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari(){               //criei o construtor padr�o PUBLIC POIS O METODO MAIN FOI PARA OUTRO PACOTE, S� ASSIM SER� VISIVEL EM OUTROS PACOTES
		this(315);          //podee usar o super ou o this  defini por padr�o a velocidade maxima 
	}
	
	/// outro construtor seria assim:
	  
	  public Ferrari(int velocidadeMaxima) {      //public aqui tamb�m pra ser visto por todos
	  		super(velocidadeMaxima);
	  		setDelta(15);
	  		          
	  		
	  }
	 
	 public void ligarTurbo() {
		 ligarTurbo = true;
	 }                                 // tive que implementar o ligar e desligar turbo j� que IMPLEMENTO A INTERFACE ESPORTIVO
	 
	 public void desligarTurbo() {
		 ligarTurbo = false;
	 }
	 
	 public void ligarAr() {
		 ligarAr = true;
		 
	 }
	 
	 public void desligarAr() {
		 ligarAr = false;
	 }
	 
	 @Override
		public int getDelta() {
		 if(ligarTurbo && !ligarAr) {        // se turbo ligado e ar desligado maior potencia
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
			
}		
			
}
//	@Override  //deixando claro que estou sobrescrevendo um m�todo, se sobrescrever n�o pode diminuir a visibilidade, por ex, de public tornar protected ou private ou padr�o
//		void acelerar() {
//		velocidadeAtual += 15;
//	}    acabou n�o precisando mais pois inseri o delta a� encima
	

