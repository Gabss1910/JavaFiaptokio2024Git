package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_VALORES = 12;
        
        int[] valores = new int[NUM_VALORES];
        
        int maiorValor = Integer.MIN_VALUE;
        
        System.out.println("Digite " + NUM_VALORES + " valores inteiros:");

        for (int i = 0; i < NUM_VALORES; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            

            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
        }
        
        System.out.println("O maior valor digitado é: " + maiorValor);

	}

}
