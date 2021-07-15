package excecaopersonalizadaA;
import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);		
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {    // AQUI TRATOU 2 BLOCOS DE EXCESSÃO DE UMA VEZ, O STRINGvAZIA E O NUMEROFORA MAS PODERIA TER FEITO INDIVIDUALMENTE
		   System.out.println(e.getMessage());                               // ESSA BARRINHA PRA CIMA | SIGNIFICA OU
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}

}
