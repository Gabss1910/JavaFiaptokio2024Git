package logica.aula.aula4;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Olá, " + nome);
		System.out.println("Olá, %s\n" + nome);
		
		int idade;
		System.out.println("Sua idade é: " + sc.nextInt());
		
		sc.close();
		
	}

}
