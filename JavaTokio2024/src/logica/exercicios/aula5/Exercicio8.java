package logica.exercicios.aula5;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
	  
        double taxaDolar = 0.20;          // 1 Real = 0.20 Dólar Americano
                 
        
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o valor em Reais: R$");
        double valorReais = scanner.nextDouble();
        
      
        double valorDolar = valorReais * taxaDolar;
       
     
        System.out.printf("Valor em Real: R$%.2f%n", valorReais);
        System.out.printf("Valor em Dólar Americano: $%.2f%n", valorDolar);;;
      
        
		
	}

}
