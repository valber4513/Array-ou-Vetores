package projetojavapacote;

import java.util.Objects;
  /* subClasse, filha da classe pessoa.java também utilizando extends pessoa */
public class Aluno extends pessoa {
	
	private String dataMatricula;
	private String serieMatriculado;
	private String nomeEscola;


	public Aluno() {

	}

	public static void main(String[] args) {

		

	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", serieMatriculado=" + serieMatriculado + ", nomeEscola="
				+ nomeEscola + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + "]";
	}

	
}
