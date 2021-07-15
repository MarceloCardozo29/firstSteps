package oo.composicao;

public class Carro {

	Motor motor = new Motor();
	
	
	void acelerar() {                                     //criou metodo acelerar
		 if(motor.fatorInjecao < 2.6) {
		 motor.fatorInjecao +=0.4;  
		 }
	 }
		 
	 
	 void frear() {                                        //criou metodo acelerar
		 if(motor.fatorInjecao > 0.5) {
		 motor.fatorInjecao -=0.4;
		 }
    }
	 
	 void ligar() {                                      //criou metodo acelerar
		 motor.ligado = true;
	 }
	 
	 void desligar() {
		 motor.ligado = false;
		 
	 }
	 
	 boolean estaLigado() {
		 return motor.ligado;
	 }
	 
}
