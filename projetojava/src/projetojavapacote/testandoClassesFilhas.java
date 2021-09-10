package projetojavapacote;


public class testandoClassesFilhas {

		public static void main(String[] args) {
		
		 
		
		/* QUando trazemos os Objetos Aluno e Diretor, também conseguimos utilizar 
		 * as Strings criada na classe pessoa, por usarmos os extends
		 */
		
 Aluno aluno = new Aluno ();
   aluno.setNome("valber"); 

   
   
   Diretor diretor = new Diretor();
   diretor.setNome(" Valber");
   
   Secretario secretario = new Secretario ();
   
   System.out.println(aluno);
   System.out.println(diretor);
   System.out.println(secretario);
   
   
		}
	
	}
	
