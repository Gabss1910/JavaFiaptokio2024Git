package logica.exercicios.aula10;

public class Exercicio2 {

	  // Método para calcular a área do terreno
    public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }

    public static void main(String[] args) {
        // Dimensões do terreno
        double largura = 10.0;   // Exemplo de largura
        double comprimento = 20.0; // Exemplo de comprimento

        // Calcula a área
        double area = calcularArea(largura, comprimento);

        // Mostra a área do terreno
        System.out.println("A área do terreno é: " + area + " metros quadrados.");
    }
}