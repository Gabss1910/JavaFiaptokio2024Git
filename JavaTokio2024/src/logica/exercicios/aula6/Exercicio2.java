package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("O número maior é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O número maior é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

	}

}
