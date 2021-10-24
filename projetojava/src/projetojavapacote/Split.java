package projetojavapacote;

import java.util.Arrays;
import java.util.List;

public class Split {

public static void main(String[] args) {
		
		
	
	String texto = " Valber, Curso Java, 100, 100, 90 ";
	String [] valoresArray = texto.split(","); /* transformo a String texto em Array
	e utilizamos   .split para fazer a leitura separado pelos sinais  ","  */
	
	System.out.println("Nome: "+ valoresArray [0]);
	System.out.println("Treinamento: "+valoresArray [1]);
	System.out.println("Nota 1: "+ valoresArray [2]);
	System.out.println("Nota 2: "+ valoresArray [3]);
	System.out.println("Nota 3: "+ valoresArray [4]);
	
	/*Convertendo um Array em uma Lista */
	
	List<String> list = Arrays.asList(valoresArray);
	
	for(String valorString : list) {
		System.out.println(valorString);
	}
	
	/* Convertendo uma lista Para Array */
	
	String [] conversaoArray = list.toArray(new String [5]);
	for(int pos = 0; pos < conversaoArray.length; pos++) {
		System.out.println(conversaoArray[pos]);
	}
	
	
	}

}
