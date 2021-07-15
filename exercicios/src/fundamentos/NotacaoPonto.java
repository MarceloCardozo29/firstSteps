package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = " Bom dia X";
		s = s.replace("X", "Senhora"); // trocou X por Senhora.
		s = s.toUpperCase();          // colocou tudo maiúsculo
		s = s.concat("!!!");         // concatenou ou adicionou 
		
		System.out.println(s);
		
		String m = "Marcelo".toUpperCase();
		System.out.println(m);
	} 

}
