package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int n;

	        do {
	            System.out.print("Digite um número inteiro positivo: ");
	            n = sc.nextInt();
	            if (n <= 0) {
	                System.out.println("Número inválido! Por favor, digite um número positivo.");
	            }
	        } while (n <= 0);

	        sc.close();

	        int soma = 0;
	        for (int i = 1; i <= n; i++) {
	            soma += i;
	        }

	        System.out.println("A soma de 1 até " + n + " é: " + soma);
	}

}
