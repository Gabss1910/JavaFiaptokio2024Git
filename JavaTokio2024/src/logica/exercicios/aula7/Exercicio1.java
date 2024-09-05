package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Olá, Mundo");

           
            System.out.print("Deseja exibir a mensagem novamente? (s/n): ");
            resposta = scanner.nextLine().trim().toLowerCase();

        } while (resposta.equals("s"));

      
        System.out.println("Fim");

	}

}
