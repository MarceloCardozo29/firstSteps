package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;       // marquei que naquele local tem uma mina
	
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registrarObservador(CampoObservador observador) {           // criei o m�todo do Campo Observador ai encima
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));              // cada observador eu dei o nome de o (letra o)
			
		
	}
	
	boolean adicionarVizinho(Campo vizinho) {                   // l�gica para adicionar vizinho apenas se ele estiver em uma das posi��es ao redor 
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;               //diagonal diferen�a de 2 sen�o diferen�a de 1
		
		int deltaLinha = Math.abs(linha - vizinho.linha);                  // distancia entre linhas
		int deltaColuna = Math.abs(coluna - vizinho.coluna);              // distancia entre colunbas
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
			} else {
				return false;
			}
				
		}
		
	public void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
			
			if (marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			} else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}
			
	public boolean abrir() {                        // CTRL + O (LETRA O)
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			
			setAberto(true);
					
			if(vizinhancaSegura()) {                          // se a vizinhan�a � segura vai ir abrindo os vizinhos at� onde der
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		} else {
			return false;
		}
		
	}
			
		
	public boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	void minar() {
		minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	
		
		
	public boolean isMarcado() {                   // funciona como um getter
		return marcado;
		
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	
	public boolean isFechado() {
		return !isAberto();
		
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
		
	}
	
	public int minasNaVizinhanca() {
		return (int) vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservadores(CampoEvento.REINICIAR);
		
	}
	
	
	}
	
	

