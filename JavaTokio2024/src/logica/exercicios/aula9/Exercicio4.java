package logica.exercicios.aula9;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("O número de alunos deve ser maior que 0.");
            scanner.close(); 
            return; 
        }

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / n;

        int abaixo = 0;
        int naMedia = 0;
        int acima = 0;

        for (double nota : notas) {
            if (nota < media) {
                abaixo++;
            } else if (nota == media) {
                naMedia++;
            } else {
                acima++;
            }
        }

        System.out.println("Média das notas: " + media);
        System.out.println("Notas abaixo da média: " + abaixo);
        System.out.println("Notas na média: " + naMedia);
        System.out.println("Notas acima da média: " + acima);


	}

}
