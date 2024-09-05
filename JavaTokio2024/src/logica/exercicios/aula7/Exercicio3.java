package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Digite um número: ");
	        int n = scanner.nextInt();

	    
	        System.out.println("Tabuada do número " + n + ":");
	        for (int i = 0; i <= 25; i++) {
	            int resultado = n * i;
	            System.out.println(n + " x " + i + " = " + resultado);
	        }
	}

}
