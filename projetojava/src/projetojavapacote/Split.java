package projetojavapacote;

public class Split {

public static void main(String[] args) {
		
		
	
	String texto = " Valber, Curso Java, 100, 100, 90 ";
	String [] valoresArray = texto.split(","); /* transformo a String texto em Array
	e utilizamos   .split para fazer a leitura separado pelos sinais  ","  */
	
	System.out.println("Nome: "+ valoresArray [0]);
	System.out.println("Treinamento: "+ valoresArray [1]);
	System.out.println("Nota 1: "+ valoresArray [2]);
	System.out.println("Nota 2: "+ valoresArray [3]);
	System.out.println("Nota 3: "+ valoresArray [4]);
	
	
	}

}
