package logica.exercicios.aula8;

public class Exercicio4 {

	 public static void main(String[] args) {
	        // Define o valor de x
	        double x = 81.0;

	        // Define o valor de π
	        double pi = Math.PI;

	        // Calcula cada parte da expressão
	        double numerador = 5 * x + 2 * Math.pow(x, 2) + 3;
	        double denominador1 = 8 - pi * x;
	        double denominador2 = 4 + x;

	        // Calcula o resultado
	        double resultado = (numerador / denominador1) * (3 / denominador2);

	        // Exibe o resultado
	        System.out.println("O valor de y é: " + resultado);
	    }
	}
