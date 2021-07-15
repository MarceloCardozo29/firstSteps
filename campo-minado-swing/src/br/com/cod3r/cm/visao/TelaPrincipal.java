package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal() {                                                                 // crtl + espaço e cliqueei eem criar o construtor
		
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);              ///RESPECTIVAMENTE QTDE DE LINHAS, COLUNAS E BOMBAS. A QTDE DE BOMBAS DEFINE A COMPLEXIDADE DO JOGO, QUANTO MAIS BOMBAS MAIS COMPLEXO
		add(new PainelTabuleiro(tabuleiro));
		
		
		setTitle("Campo Minado");                           // deu o titulo
		setSize(690, 438);                                  // escolheu o tamanho
		setLocationRelativeTo(null);                        // centralizou a tela
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);            // quando fechar a janela fecha o programa, ja que por padrão o programa continua rodando
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
		
		
		
	}

}
