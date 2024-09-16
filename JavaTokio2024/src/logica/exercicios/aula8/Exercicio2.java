package logica.exercicios.aula8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercicio2 {

	  // Método para verificar o dia da semana e exibir a mensagem apropriada
    public static void verificarDia() {
        // Obtém a data atual
        LocalDate hoje = LocalDate.now();
        
        // Obtém o dia da semana atual
        DayOfWeek diaDaSemana = hoje.getDayOfWeek();
        
        // Verifica se é terça-feira e exibe a mensagem
        if (diaDaSemana == DayOfWeek.TUESDAY) {
            System.out.println("Hoje é terça-feira. Haverá feira de rua!");
        } else {
            System.out.println("Hoje não é terça-feira.");
        }
    }

    public static void main(String[] args) {
        // Verifica o dia da semana e exibe a mensagem
        verificarDia();
    }
}