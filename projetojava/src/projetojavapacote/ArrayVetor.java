package projetojavapacote;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {

		/* Alterado local para envio GitHub3*/
		/*Tornando Array totalmente Dinamico onde o usuario escolhe quantas repeti��es e qual o valor ser� impresso */
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter ? ");
		
		
		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da Posi��o Numero = " + (pos+1));
			notas[pos] = Double.valueOf(valor);
		}
		
		
			/* notas.length, deixa mais dinamico , n�o sendo necess�rio
			 * declarar novamente quantas repeti��es */
			 
		for (int pos = 0; pos < notas.length; pos++) {
		
		
		
			System.out.println("Nota " + (pos + 1 ) + " � = " + notas[pos]);
		}
	}
	}
