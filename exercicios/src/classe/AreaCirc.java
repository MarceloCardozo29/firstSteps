package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;                  // final static ou static final a ordem n�o tem import�ncia
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
}


