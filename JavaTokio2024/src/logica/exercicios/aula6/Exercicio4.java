package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (A): ");
        int A = sc.nextInt();

        System.out.print("Digite o segundo valor (B): ");
        int B = sc.nextInt();

        sc.close();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");

        }
	}
}
