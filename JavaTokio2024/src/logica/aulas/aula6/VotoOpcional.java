package logica.aulas.aula6;

public class VotoOpcional {

	public static void main(String[] args) {
		
		int idade = 71;
		
		boolean verificaMenorIdade = idade >= 16 && idade < 18;
		System.out.println("Voto opc menor idade: " + verificaMenorIdade);
		
		boolean verificaVein = idade > 70;
		System.out.println("Voto opc maior de idade (vein): " + verificaVein);
		
		if (verificaMenorIdade || verificaVein) {
			System.out.println("Voto opcional");
		}
		
		if ((idade >= 16 && idade< 18) || idade > 70) {
			System.out.println("Voto opcional");
		}
	}

}
