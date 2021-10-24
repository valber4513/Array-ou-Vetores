package projetojavapacote;

public class Matriz {

	public static void main(String[] args) {

		
		/*INTRODUÇÃO A MATRIZES */
		
		int[][] notas = new int[2][3];

		/* primeiro elemento 0 */
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;

		/* segundo elemento, 1 */
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		
/*verificando as linhas */
		for (int poslinha = 0; poslinha < notas.length; poslinha++) {
/*Verificando as Colunas */
			System.out.println("_________________");
			
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println(" Valor da Matriz: " + notas[poslinha][poscoluna]);
			}

		}

	}
}