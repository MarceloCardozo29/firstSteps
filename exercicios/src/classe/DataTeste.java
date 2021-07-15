package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		
		Data d1 = new Data();                      // Não importou nada pois Data está dentro do mesmo pacote.
		d1.dia = 29;
		d1.mes = 12;
		d1.ano = 2020;
		
		var d2 = new Data();
		d2.dia = 01;
		d2.mes = 01;
		d2.ano = 2021;
		
		System.out.println(d1.obterDataFormatada());
		
		System.out.printf(d2.obterDataFormatada());
	}

}
