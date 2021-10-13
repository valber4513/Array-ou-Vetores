package projetojavapacote;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {

		/*Criação do ALuno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Valber ");
		aluno.setNomeEscola("JDEV Treinament");
		
		/*Criação da Disciplina*/
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Curso Java");
	double[] notas = {8.8 , 9.7 , 7.6 , 6.8};
	disciplina.setNota(notas);
	
	aluno.getDisciplina().add(disciplina);
	
	/*criação disciplina 2 */
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("HTML");
	double[] notasLogica = {7.1 , 5.7 , 9.6 , 7.8};
	disciplina2.setNota(notasLogica);
	
	aluno.getDisciplina().add(disciplina2);
	
	
	
	}
	}
