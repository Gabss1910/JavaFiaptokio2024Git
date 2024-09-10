package logica.aulas.aula09;

public class Matrizes {

	public static void main(String[] args) {
		
		// TABULEIRO DO JOGO DA VELHA
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'x';
		tabuleiro[1][1] = 'o';
		tabuleiro[2][2] = 'x';
		
		System.out.println();
		
		
		// CRIANDO MAIS ALGUMAS MATRIZES
		
		int[][] matriz = new int[4][5];
		
		int linhas = matriz.length;
		System.out.println(linhas);
		
		int colunas = matriz[0].length;
		System.out.println(colunas);
		
		int numero = 1;
		// FOR PARA CONCLUIR VALORES NA MATRIZ
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = numero;
				numero++;
			
			}
		}
		
		
		// FOR PARA EXIBIR MATRIZ
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
