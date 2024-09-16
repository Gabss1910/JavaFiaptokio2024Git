package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o tipo de cliente (1 para residência, 2 para comércio, 3 para indústria): ");
	        int tipoCliente = sc.nextInt();

	        System.out.print("Digite o consumo de energia em kWh: ");
	        double consumo = sc.nextDouble();
	        
	        double valorKWh = 0.0;

	        switch (tipoCliente) {
	            case 1:
	                valorKWh = 0.60;
	                break;
	            case 2:
	                valorKWh = 0.48;
	                break;
	            case 3:
	                valorKWh = 1.29;
	                break;
	            default:
	                System.out.println("Tipo de cliente inválido.");
	                return; 
	        }

	      
	        double valorConta = consumo * valorKWh;

	    
	        System.out.printf("O valor da conta de luz é: R$ %.2f\n", valorConta);


	}

}
