package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota do primeiro bimestre");
		int bimestre1 = sc.nextInt();
		
		System.out.println("Digite a nota do segundo bimestre");
		int bimestre2 = sc.nextInt();
		
		System.out.println("Digite a nota do terceiro bimestre");
		int bimestre3 = sc.nextInt();
		
		System.out.println("Digite a nota do quarto bimestre");
		int bimestre4 = sc.nextInt();
		
		
		double media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) /4;
		
		 if (media >= 7) {
	            System.out.println("Aprovado");
	        } else if (media >= 5) {
	            System.out.println("Em recuperação");
	        } else {
	            System.out.println("Reprovado");
	        }
		
	

	}

}
