package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {
		
		String srt = "FIAP Paulista";
		
		int tamanhoSrt = srt.length();
		
		System.out.println(tamanhoSrt);
		
		System.out.println(srt.charAt(0));
		System.out.println(srt.charAt(1));
		System.out.println(srt.charAt(2));
		System.out.println(srt.charAt(3));
		System.out.println(srt.charAt(4));
		System.out.println(srt.charAt(5));
		
		System.out.println("-------------");
		
		for (int i = 0; i < tamanhoSrt; i++) {
			System.out.println(srt.charAt(i));
		}
	}

}
