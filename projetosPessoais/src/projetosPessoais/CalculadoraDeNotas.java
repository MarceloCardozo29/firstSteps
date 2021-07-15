package projetosPessoais;

import javax.swing.JOptionPane;

public class CalculadoraDeNotas {

	public static void main(String[] args) {
		
		//string A1, A2, A3, A4, N1, N2;
		
		String A1 = JOptionPane.showInputDialog("Digite sua nota da A1");
		double a1 = Double.parseDouble(A1);
		
		
		String A2 = JOptionPane.showInputDialog("Digite sua nota da A2");
		double a2 = Double.parseDouble(A2);
		
		
		String A3 = JOptionPane.showInputDialog("Digite sua nota da A3");
		double a3 = Double.parseDouble(A3);
		
		
		String A4 = JOptionPane.showInputDialog("Digite sua nota da A4");
		double a4 = Double.parseDouble(A4);
		
		double N1 = ((a1 + a2 + a3 + a4) / 4);
		
		System.out.printf(" A média da sua  N1 é: %.2f", N1);
		
		String N2 = JOptionPane.showInputDialog("Digite sua nota da N2");
		double n2 = Double.parseDouble(N2);
		
		double notaFinal = ( N1 * 0.4) + (n2 * 0.6);
		
		System.out.printf("\n Sua nota final é: %.2f", notaFinal);
		
		System.out.println();
		
		
	}
}
