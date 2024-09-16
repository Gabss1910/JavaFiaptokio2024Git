package logica.exercicios.aula10;

public class Exercicio5 {

	  // Método para converter a temperatura e exibir nas três escalas
    public static void converterTemperatura(double temperatura, char escala) {
        double celsius, fahrenheit, kelvin;

        switch (escala) {
            case 'C': // Temperatura em Celsius
                celsius = temperatura;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                break;
            case 'F': // Temperatura em Fahrenheit
                fahrenheit = temperatura;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                break;
            case 'K': // Temperatura em Kelvin
                kelvin = temperatura;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                break;
            default:
                System.out.println("Erro: Escala inválida. Use 'C' para Celsius, 'F' para Fahrenheit ou 'K' para Kelvin.");
                return;
        }

        // Exibe a temperatura nas três escalas
        System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2fK%n", kelvin);
    }

    public static void main(String[] args) {
        // Exemplo de temperatura e escala
        double temperatura = 25.0;
        char escala = 'C'; // Pode ser 'C', 'F' ou 'K'

        // Converte e exibe a temperatura nas três escalas
        converterTemperatura(temperatura, escala);
    }
}
