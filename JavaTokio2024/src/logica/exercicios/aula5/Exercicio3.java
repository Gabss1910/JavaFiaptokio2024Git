package logica.exercicios.aula5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.println("Digite seu nome: ");
	        String nome = sc.nextLine();
	        
	        System.out.println("Digite seu gênero: M para masculino, F para feminino, O para outro, N para não responder");
	        String genero = sc.nextLine();
	        
	        System.out.printf("Olá " + nome);
	        System.out.println("Seu gênero é :" + genero); // oi

	       


	}

	
}
