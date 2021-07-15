package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;              // 1 é apenas o motor ligado. acelerendo esse número vai aumentar
	
	int giros () {
		if(!ligado) {                     // se diferente de ligado
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
	
	
}
