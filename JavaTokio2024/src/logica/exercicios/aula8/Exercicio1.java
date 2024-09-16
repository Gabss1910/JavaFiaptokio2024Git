package logica.exercicios.aula8;

import java.time.LocalTime;

public class Exercicio1 {

	// Método para exibir a saudação com base na hora do dia
    public static void exibirSaudacao(String nome) {
        // Obtém a hora atual
        LocalTime horaAtual = LocalTime.now();
        
        // Define os horários de referência para as saudações
        LocalTime manha = LocalTime.of(6, 0);   // 6h da manhã
        LocalTime tarde = LocalTime.of(12, 0);  // 12h
        LocalTime noite = LocalTime.of(18, 0);  // 18h

        // Determina a saudação com base na hora atual
        if (horaAtual.isBefore(tarde)) {
            if (horaAtual.isBefore(manha)) {
                System.out.println("Bom dia, " + nome + "!");
            } else {
                System.out.println("Bom dia, " + nome + "!");
            }
        } else if (horaAtual.isBefore(noite)) {
            System.out.println("Boa tarde, " + nome + "!");
        } else {
            System.out.println("Boa noite, " + nome + "!");
        }
    }

    public static void main(String[] args) {
        // Nome do usuário
        String nome = "FULANO";

        // Exibe a saudação com base na hora atual
        exibirSaudacao(nome);
    }
}