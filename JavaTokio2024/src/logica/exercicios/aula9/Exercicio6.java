package logica.exercicios.aula9;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o tamanho do vetor (n): ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("O tamanho do vetor deve ser maior que 0.");
	            sc.close(); 
	            return; 
	        }

	        int[] vetor = new int[n];

	        System.out.println("Digite " + n + " números inteiros:");
	        for (int i = 0; i < n; i++) {
	            vetor[i] = sc.nextInt();
	        }

	        int soma = 0;
	        for (int i = 0; i < n; i++) {
	            soma += vetor[i];
	        }

	        System.out.println("A somatória dos números no vetor é: " + soma);

	}

}
