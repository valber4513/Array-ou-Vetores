package projetojavapacote;


public class testandoClassesFilhas {

		public static void main(String[] args) {
		
		 
		
		/* QUando trazemos os Objetos Aluno e Diretor, também conseguimos utilizar 
		 * as Strings criada na classe pessoa, por usarmos os extends
		 */
		
 Aluno aluno = new Aluno ();
   aluno.setNome("valber"); 
   aluno.setIdade(16);

   
   Diretor diretor = new Diretor();
   diretor.setNome(" Alex ");
   diretor.setIdade(50);
   
   Secretario secretario = new Secretario ();
   secretario.setNome("jorge");
   secretario.setIdade(18);
   
   System.out.println(aluno);
   System.out.println(diretor);
   System.out.println(secretario);
   
   /* Imprimimos o resultado que foi criado na classe Herança Pai passando
    * para todas as subClasses
    */
   System.out.println(aluno.pessoaMaiorIdade() + "____" +aluno.msgMaiorIdade());
   System.out.println(diretor.pessoaMaiorIdade());
   System.out.println(secretario.pessoaMaiorIdade());
   
		}
	
	}
	
