package logica.exercicios.aula5;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

       
        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

       
        double troco = valorPago - valorProduto;

       
        if (troco < 0) 
            System.out.println("Valor pago é insuficiente para cobrir o valor do produto.");

           
            System.out.printf("O troco a ser pago é: R$ %.2f%n", troco);; 
            
            

	}

}

