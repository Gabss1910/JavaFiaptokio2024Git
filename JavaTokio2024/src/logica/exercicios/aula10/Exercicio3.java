package logica.exercicios.aula10;

public class Exercicio3 {
	
	// Método para determinar a situação do voto com base na idade
    public static void verificarVoto(int idade) {
        if (idade < 16) {
            System.out.println("Voto proibido.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto opcional.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto opcional.");
        }
    }

    public static void main(String[] args) {
        // Idade da pessoa
        int idade = 25; // Exemplo de idade

        // Verifica a situação do voto
        verificarVoto(idade);
    }
}
