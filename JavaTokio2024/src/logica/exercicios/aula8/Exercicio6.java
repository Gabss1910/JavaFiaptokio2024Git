package logica.exercicios.aula8;

import java.util.Random;

class Exercicio6 {

	  public static void main(String[] args) {
	        // Cria uma instância da classe Random
	        Random random = new Random();
	        
	        // Define o intervalo dos números aleatórios
	        int min = 0;
	        int max = 100;
	        
	        // Contadores para números pares, ímpares e primos
	        int contPares = 0;
	        int contImpares = 0;
	        int contPrimos = 0;

	        // Sorteia 100 números aleatórios e conta os tipos
	        for (int i = 0; i < 100; i++) {
	            int numero = random.nextInt(max - min + 1) + min;
	            
	            // Verifica se o número é par ou ímpar
	            if (numero % 2 == 0) {
	                contPares++;
	            } else {
	                contImpares++;
	            }

	            // Verifica se o número é primo
	            if (ehPrimo(numero)) {
	                contPrimos++;
	            }
	        }

	        // Exibe os resultados
	        System.out.println("Foram sorteados " + contPares + " números pares.");
	        System.out.println("Foram sorteados " + contImpares + " números ímpares.");
	        System.out.println("Foram sorteados " + contPrimos + " números primos.");
	    }

	    // Método para verificar se um número é primo
	    public static boolean ehPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
