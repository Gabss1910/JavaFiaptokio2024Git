package logica.exercicios.aula9;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (n > 0): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("O valor de n deve ser maior que 0.");
            scanner.close(); 
            return; 
        }

        double[] vetor = new double[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            vetor[i] = random.nextDouble() * 100; 
        }


        System.out.println("Números gerados no vetor:");
        for (double numero : vetor) {
            System.out.println(numero);
        }

	}

}
