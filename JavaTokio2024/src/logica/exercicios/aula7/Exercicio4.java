package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_VALORES = 10;
        
        int[] valores = new int[NUM_VALORES];
        
        int soma = 0;
        
        System.out.println("Digite " + NUM_VALORES + " valores inteiros:");

        for (int i = 0; i < NUM_VALORES; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            soma += valores[i];
        }
        
        System.out.println("A soma dos valores digitados é: " + soma);

	}

}
