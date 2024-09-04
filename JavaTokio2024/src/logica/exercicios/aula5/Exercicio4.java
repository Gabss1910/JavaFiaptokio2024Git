package logica.exercicios.aula5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite a primeira nota (A): ");
        double notaA = sc.nextDouble();
        
        System.out.print("Digite o peso da primeira nota: ");
        double pesoA = sc.nextDouble();

        System.out.print("Digite a segunda nota (B): ");
        double notaB = sc.nextDouble();
        
        System.out.print("Digite o peso da segunda nota: ");
        double pesoB = sc.nextDouble();

      
        double mediaPonderada = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB); // oi

        
        System.out.printf("A média ponderada das notas é: %.2f%n", mediaPonderada);

	}

}
