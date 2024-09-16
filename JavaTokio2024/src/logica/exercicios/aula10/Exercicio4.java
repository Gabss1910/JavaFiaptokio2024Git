package logica.exercicios.aula10;

public class Exercicio4 {

    // Método para realizar a operação matemática
    public static double calcular(double num1, double num2, char operador) {
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return Double.NaN; // Retorna Not-a-Number em caso de erro
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                return Double.NaN; // Retorna Not-a-Number em caso de erro
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Exemplo de números e operador
        double numero1 = 10.0;
        double numero2 = 5.0;
        char operador = '+';

        // Calcula o resultado
        double resultado = calcular(numero1, numero2, operador);

        // Verifica e exibe o resultado
        if (!Double.isNaN(resultado)) {
            System.out.println("O resultado da operação é: " + resultado);
        }
    }
}
