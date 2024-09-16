package logica.exercicios.aula8;

import java.util.Random;

public class Exercicio5 {


    public static void main(String[] args) {
        // Cria uma instância da classe Random
        Random random = new Random();

        // Define o intervalo dos números aleatórios
        int min = 5;
        int max = 50;

        // Variável para armazenar a soma dos números
        int soma = 0;

        // Sorteia 10 números aleatórios e calcula a soma
        for (int i = 0; i < 10; i++) {
            // Gera um número aleatório entre min e max (inclusive)
            int numero = random.nextInt(max - min + 1) + min;
            
            // Adiciona o número à soma
            soma += numero;
            
            // Exibe o número sorteado
            System.out.println("Número sorteado: " + numero);
        }

        // Exibe a soma dos números
        System.out.println("A soma dos 10 números sorteados é: " + soma);
    }
}