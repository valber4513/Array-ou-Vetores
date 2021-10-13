package projetojavapacote;

import java.util.ArrayList;
import java.util.Objects;

import java.awt.List;


/* subClasse, filha da classe pessoa.java também utilizando extends pessoa */
public class Aluno extends pessoa {

	private String dataMatricula;
	private String serieMatriculado;
	private String nomeEscola;
	
	
	
	
	
	
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
	
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

	/*
	 * OVERRIDE SIGNIFICA METODO JÁ FOI CRIADO E ESTA SENDO USADO NOVAMENTE EXEMPLO
	 * COM A PUBLIC BOOLEAN PESSOAMAIORIDADE
	 */
	@Override
	public boolean pessoaMaiorIdade() {

		return idade >= 21; /*
							 * podemos criar também regras de negócios servindo para apenas subclasse aluno
							 */
	}

	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba Aluno Maior de Idade" : " OPA Aluno Menor de Idade";
	}

	@Override
	/*Conforme foi criado metodo Abstract na classe pai, é obrigatorio criar também nas classes filhas 
	 * como exemplo abaixo
	 */
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.90;
	}
	
	public double getMediaNota() {
		double somaNotas  = 0.0;
		for(Disciplina disciplina : disciplina) {
			somaNotas += disciplina.getMediaNotas();
		}
		return somaNotas / disciplina.size();
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
