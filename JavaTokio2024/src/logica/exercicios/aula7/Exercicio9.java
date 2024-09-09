package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	        int n;
	        
	        System.out.print("Digite um número inteiro positivo: ");
	        n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("Número inválido! Por favor, digite um número positivo.");
	        } else {
	        	
	            System.out.println("Divisores de " + n + ":");
	            for (int i = 1; i <= n; i++) {
	                if (n % i == 0) {
	                    System.out.println(i);
	                }
	            }
	        }


	}

}
