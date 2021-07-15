package br.com.cod3r.calc.visao;          //CTRL + SHIFT + O(LETRA O) PARA ORGANIZAR IMPORTS
 
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;                               
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final  JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);       // display será notificado sempre que o valor da memoria mudar
		
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());         //se tiver vazio, mostra o valor zero, senão mostra o valor digitado
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));    //Alinhando os numeros digitados à direita, alinhamento horizontal e alinhamento vertical
		
		
		add(label);
		
}	

	public void valorAlterado(String novoValor) {
		label.setText(novoValor);                      //LABEL VAI RECEBER O VALOR DE novoValor
	}
	
}
