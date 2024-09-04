package logica.exercicios.aula5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);

        
        final double PESO_A = 4;
        final double PESO_B = 6;

        
        System.out.print("Digite a nota A: ");
        double notaA = sc.nextDouble();
 
        System.out.print("Digite a nota B: ");
        double notaB = sc.nextDouble();
        
        double mediaPonderada = (notaA * PESO_A + notaB * PESO_B) / (PESO_A + PESO_B);

        System.out.printf("A média ponderada das notas é: %.2f%n", mediaPonderada); //oi

	}

}
