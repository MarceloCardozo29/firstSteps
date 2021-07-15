package oo.heranca.desafio;

//A classe pai não tem mais o construtor padrão pois foi alterado, agora precisa definir um construtor, esta dando erro
public class Ferrari extends Carro implements Esportivo, Luxo {       // implemets significa que implementa uma interface
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari(){               //criei o construtor padrão PUBLIC POIS O METODO MAIN FOI PARA OUTRO PACOTE, SÓ ASSIM SERÁ VISIVEL EM OUTROS PACOTES
		this(315);          //podee usar o super ou o this  defini por padrão a velocidade maxima 
	}
	
	/// outro construtor seria assim:
	  
	  public Ferrari(int velocidadeMaxima) {      //public aqui também pra ser visto por todos
	  		super(velocidadeMaxima);
	  		setDelta(15);
	  		          
	  		
	  }
	 
	 public void ligarTurbo() {
		 ligarTurbo = true;
	 }                                 // tive que implementar o ligar e desligar turbo já que IMPLEMENTO A INTERFACE ESPORTIVO
	 
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
//	@Override  //deixando claro que estou sobrescrevendo um método, se sobrescrever não pode diminuir a visibilidade, por ex, de public tornar protected ou private ou padrão
//		void acelerar() {
//		velocidadeAtual += 15;
//	}    acabou não precisando mais pois inseri o delta aí encima
	

