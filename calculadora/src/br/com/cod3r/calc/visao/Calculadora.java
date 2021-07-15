package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	
	public Calculadora() {
		
		organizarLayout();
		
		
		
		setSize(232, 322);     //tamanho
		setDefaultCloseOperation(EXIT_ON_CLOSE); //parar aplica��o quando fechar
		setLocationRelativeTo(null);             // localiza��o no meio da tela
		setVisible(true);                 
	
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);                                 // o metodo add recebi por heran�a do JFrame
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER); 
	}
	
	public static void main(String[] args) {
		new Calculadora();
		
	}

}
