package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.print("Digite um valor final: ");
        int valorFinal = sc.nextInt();
        
        sc.close();
        
        if (valorFinal >= 2) {
            System.out.println("Valores pares entre 2 e " + valorFinal + ":");
            
            for (int i = 2; i <= valorFinal; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("O valor final deve ser maior ou igual a 2.");
            
        }

	}

}
