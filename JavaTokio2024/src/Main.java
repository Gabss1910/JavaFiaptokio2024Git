import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
	} {
       
        int numero = 10;

       
        System.out.println(numero);
        
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite seu nome: ");
			String nome = scanner.nextLine();

			
			System.out.println("Olá, " + nome + "!");
		}
        
        
    }
}