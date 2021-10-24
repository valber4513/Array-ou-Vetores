package projetojavapacote;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {

		/* Criação do ALuno1 */
		Aluno aluno = new Aluno();
		aluno.setNome("Valber ");
		aluno.setNomeEscola("JDEV Treinament");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		disciplina.setNota(notas);

		aluno.getDisciplina().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");
		double[] notasLogica = { 7.1, 5.7, 9.6, 7.8 };
		disciplina2.setNota(notasLogica);

		aluno.getDisciplina().add(disciplina2);

		/* Adicionando um segundo Aluno e repetindo as mesma regras */
		/* Criação do Aluno2 */
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Valti ");
		aluno2.setNomeEscola("JDEV Treinament");

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Java Script");
		disciplina3.setNota(notasLogica);

		aluno2.getDisciplina().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Logica de Programação");
		disciplina2.setNota(notasLogica);

		aluno2.getDisciplina().add(disciplina4);

		/* Condições que servira para os dois alunos */
		Aluno[] arrayAlunos = new Aluno[2];

		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {

			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplina()) {

				System.out.println("Nome da disciplina é : " + d.getDisciplina());

				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A Nota número : " + posnota + " é igual = " + d.getNota()[posnota]);
				}
			}

		}
	}

}
