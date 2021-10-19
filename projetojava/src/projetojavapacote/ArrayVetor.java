package projetojavapacote;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {

		/* Criação do ALuno */
		Aluno aluno = new Aluno();
		aluno.setNome("Valber ");
		aluno.setNomeEscola("JDEV Treinament");

		/* Criação da Disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		disciplina.setNota(notas);

		aluno.getDisciplina().add(disciplina);

		/* criação disciplina 2 */
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");
		double[] notasLogica = { 7.1, 5.7, 9.6, 7.8 };
		disciplina2.setNota(notasLogica);

		aluno.getDisciplina().add(disciplina2);

		/*percorrendo as notas */
		System.out.println("Nome do aluno = " + aluno.getNome() + " Inscrito no Curso : " + aluno.getNomeEscola());
		System.out.println("__________ Disciplina do Aluno _____");
		for (Disciplina d : aluno.getDisciplina()) {

			System.out.println("Disciplina :" + d.getDisciplina());
			System.out.println("As notas das disciplinas são: ");
			
			/*encontrando a nota Maior */
			double notaMax = 0.0;
			
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
				
				/*Encontrando a nota maior */
				if(pos==0 ) {
					notaMax = d.getNota()[pos];
				}else {
					if(d.getNota()[pos]>notaMax){
						notaMax = d.getNota()[pos];
					}
				}
				
			}
			System.out.println("A Maior nota da Disciplina = " + d.getDisciplina() + "é de valor" + notaMax );
		}
		
	}
	
}
