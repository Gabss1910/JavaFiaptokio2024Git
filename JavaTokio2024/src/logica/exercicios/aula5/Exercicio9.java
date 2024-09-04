package logica.exercicios.aula5;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
	   
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número (0 a 999): ");
        int numero = sc.nextInt();
        
        System.out.println(" ");
        System.out.println("Valor digitado: " + numero);


            int centenas = (numero / 100) * 100;
            int dezenas = ((numero % 100) / 10) * 10;
            int unidades = numero % 10;


            System.out.println("Número digitado: " + numero);
            System.out.println("Centena = " + centenas);
            System.out.println("Dezena = " + dezenas);
            System.out.println("Unidade = " + unidades);
            
		
		

            
	}

}

