package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   // por padrão quando fecha a janela o programa continua rodando, colocando essa linha, quando fechar a janela vai fechar o programa
		janela.setSize(600, 200);                 // defini o tamanho da janela
		janela.setLayout(new FlowLayout());         // definiu o layout do botão
		janela.setLocationRelativeTo(null);          // define a abertura da janela centralizada com a tela do pc
		
		
		
		
		
		
		JButton botao = new JButton ("Clicar");
		janela.add(botao);
		
		/*
		botao.addActionListener(new ActionListener() {              // ActionListener tem um único método, é uma interface funcional
			
			
			public void actionPerformed(ActionEvent e) {
				
				
				System.out.println("Evento ocorreu!");
			}
		});         
			
		*/
		// OU USA LAMBDA
		
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!!!");  // quando clico no botão aparece a frase entre aspas
			
		});
		
				
		janela.setVisible(true);
		
		
	}

}
