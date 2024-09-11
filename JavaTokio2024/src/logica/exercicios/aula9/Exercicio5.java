package logica.exercicios.aula9;

public class Exercicio5 {

	public static void main(String[] args) {
		
		String[] meses = {
	            "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
	            "Jul", "Ago", "Set", "Out", "Nov", "Dez"
	        };

	        int[] dias = {
	            31, 28, 31, 30, 31, 30,
	            31, 31, 30, 31, 30, 31
	        };

	        for (int i = 0; i < meses.length; i++) {
	            System.out.println("O mês de " + meses[i] + " tem " + dias[i] + " dias ao todo.");
	        }

	}

}
