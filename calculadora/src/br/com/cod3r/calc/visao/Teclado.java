package br.com.cod3r.calc.visao;          // CTRL + SHIFT + O(LETRA O) PARA ORGANIZAR IMPORTS

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	
	private final Color COR_CINZA_ESCURO = new Color(68, 69, 68);
	private final Color COR_CINZA_CLARO = new Color(97, 100, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);
	
	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.weighty= 1;                                           // PREENCHEU OS BOTOES DO EIXO Y ATE O LIMITE  // EIXO Y VERTICAL
		c.weightx = 1;                                         // PREENCHEU OS BOTOES DO EIXO X ATE O LIMITE // EIXO X HORIZONTAL
		c.fill = GridBagConstraints.BOTH;                      // EXPANDE OS BOTOES NOS EIXOS X e Y preenchendo espaços em branco
		
		//LINHA 1
		c.gridwidth = 2;                                 //TODOS ABAIXO TERÃO TAMANHO 3
		adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;                               //VOLTANDO AO TAMANHO NORMAL  
		adicionarBotao("±", COR_CINZA_ESCURO, c, 2, 0);        // ALT + 241 PARA O SÍMBOLO ±(ASCII MINUS PLUS SYMBOL)
		adicionarBotao("/", COR_LARANJA, c, 3, 0);
		
		//LINHA 2
		adicionarBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adicionarBotao("*", COR_LARANJA, c, 3, 1);
		
		//LINHA 3
		adicionarBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionarBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", COR_LARANJA, c, 3, 2);
		
		//LINHA 4
		adicionarBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionarBotao("3", COR_CINZA_CLARO, c, 2, 3);
		adicionarBotao("+", COR_LARANJA, c, 3, 3);
		
		//LINHA 5
		c.gridwidth = 2; 
		adicionarBotao("0", COR_CINZA_CLARO, c, 0, 4);      //BOTÃO ZERO FICOU COM TAMANHO 2
		c.gridwidth = 1;                                    // COLOCANDO TODOS EM TAMANHO NORMAL
		adicionarBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adicionarBotao("=", COR_LARANJA, c, 3, 4);
		
	}
		
		
	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
	}


	@Override
	public void actionPerformed(ActionEvent e) {                            // IMPLEMENTANDO O MÉTODO ACTIONLISTENER e MOSTRANDO O NÚMERO DIGITADO
		if(e.getSource() instanceof JButton) {
		JButton botao = (JButton) e.getSource();
		System.out.println(botao.getText());
		Memoria.getInstancia().processarComando(botao.getText());
		
		}
		
	}
		
}


