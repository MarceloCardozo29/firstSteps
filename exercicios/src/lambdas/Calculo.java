package lambdas;

@FunctionalInterface               //SIGNIFICA QUE A INTERFACE TER� APENAS UM M�TODO(ABSTRATO????),  SE INSERIR UM SEGUNDO M�TODO QUE N�O SEJA O DEFAULT OU O STATIC DEIXA DE SER @FunctionalInterface 
public interface Calculo {         // M�TODOS DENTRO DE INTERFACE POR PADR�O S�O PUBLICOS A ABSTRATOS
	                               // VAI EXISTIR UMA CLASSE QUE VAI IMPLEMENTAR ESSA INTERFACE  
	double executar(double a, double b);
	

}
 