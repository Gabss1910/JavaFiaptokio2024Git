package logica.exercicios.aula7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        
        final int NUM_ALUNOS = 20;
        
        double[] notas = new double[NUM_ALUNOS];
        
        System.out.print("Digite a média da turma: ");
        double mediaTurma = sc.nextDouble();
        
        System.out.println("Digite as notas dos " + NUM_ALUNOS + " alunos:");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        sc.close();
        
        int contMaior = 0;
        int contMenor = 0;
        
        for (double nota : notas) {
            if (nota > mediaTurma) {
                contMaior++;
            } else if (nota < mediaTurma) {
                contMenor++;
            }
        }
        

        System.out.println("Número de alunos com nota superior à média: " + contMaior);
        System.out.println("Número de alunos com nota inferior à média: " + contMenor);


	}

}
