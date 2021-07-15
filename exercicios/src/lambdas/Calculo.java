package lambdas;

@FunctionalInterface               //SIGNIFICA QUE A INTERFACE TERÁ APENAS UM MÉTODO(ABSTRATO????),  SE INSERIR UM SEGUNDO MÉTODO QUE NÃO SEJA O DEFAULT OU O STATIC DEIXA DE SER @FunctionalInterface 
public interface Calculo {         // MÉTODOS DENTRO DE INTERFACE POR PADRÃO SÃO PUBLICOS A ABSTRATOS
	                               // VAI EXISTIR UMA CLASSE QUE VAI IMPLEMENTAR ESSA INTERFACE  
	double executar(double a, double b);
	

}
 