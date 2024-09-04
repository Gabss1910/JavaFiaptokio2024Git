package logica.exercicios.aula5;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 
        int numeroInteiro = 10;
        float numeroFloat = 10.5f;
        double numeroDouble = 10.12345;

        System.out.println("Valores originais:");
        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Float: " + numeroFloat);
        System.out.println("Double: " + numeroDouble);

        String strInteiro = Integer.toString(numeroInteiro);
        String strFloat = Float.toString(numeroFloat);
        String strDouble = Double.toString(numeroDouble);

        System.out.println("\nValores convertidos para String:");
        System.out.println("Inteiro: " + strInteiro);
        System.out.println("Float: " + strFloat);
        System.out.println("Double: " + strDouble); // oi
	}

}
