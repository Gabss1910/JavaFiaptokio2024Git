package logica.exercicios.aula5;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o nome da peça 1: ");
        String nomePeca1 = sc.nextLine();

        System.out.print("Digite o número de peças 1: ");
        int numeroPeca1 = sc.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = sc.nextDouble();
        

        
        sc.nextLine();

        
        System.out.print("Digite o nome da peça 2: ");
        String nomePeca2 = sc.nextLine();

        System.out.print("Digite o número de peças 2: ");
        int numeroPeca2 = sc.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = sc.nextDouble();

        
        double valorTotalPeca1 = numeroPeca1 * valorUnitarioPeca1;
        double valorTotalPeca2 = numeroPeca2 * valorUnitarioPeca2;
        double valorTotal = valorTotalPeca1 + valorTotalPeca2;

        
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorTotal);

	}

}
