package logica.exercicios.aula8;

import java.util.Scanner;

public class Exercicio3 {


    // Método para contar os diferentes tipos de caracteres
    public static void contarCaracteres(String texto) {
        int maiusculos = 0;
        int minusculos = 0;
        int numericos = 0;
        int espacos = 0;

        // Itera sobre cada caractere do texto
        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c)) {
                maiusculos++;
            } else if (Character.isLowerCase(c)) {
                minusculos++;
            } else if (Character.isDigit(c)) {
                numericos++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de caracteres alfabéticos maiúsculos: " + maiusculos);
        System.out.println("Quantidade de caracteres alfabéticos minúsculos: " + minusculos);
        System.out.println("Quantidade de caracteres numéricos: " + numericos);
        System.out.println("Quantidade de espaços em branco: " + espacos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o texto ao usuário
        System.out.println("Digite um texto qualquer:");
        String texto = sc.nextLine();

        // Conta os caracteres e exibe os resultados
        contarCaracteres(texto);
        
    }
}
