package padroes.observer;


@FunctionalInterface
public interface ObservadorChegadaAniversariante {       //EM INTERFACE O MÉTODO POR PADRÃO É ABSTRATO
	
	public void chegou(EventoChegadaAniversariante evento);

}
