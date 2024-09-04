package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {

		double salario = 1416.30;
		String salarioSrt = Double.toString(salario);
		
		System.out.println(salario+salario);
		System.out.println(salarioSrt+salarioSrt);
		
		System.out.println(" ");
		
		String idade = "25";
		int idadeInteiro = Integer.parseInt(idade);
		
		System.out.println(idadeInteiro);
		
		System.out.println(" ");
		
		// INSTANCIAR O SCANNER
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preco do produto: ");
		String preco = scanner.nextLine();
		
		float precoFloat = Float.parseFloat(preco);

		System.out.println(preco+preco);
		System.out.println(precoFloat+precoFloat);
		
		
		
		
	}

}
