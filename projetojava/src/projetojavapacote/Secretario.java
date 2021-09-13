package projetojavapacote;

public class Secretario extends pessoa {

/*Classe Filha da herança pessoa.java sempre utilizando no inicio " extends "*/
		
	private String	registro;
	private String nivelCargo;
	private String experienciaString;
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperienciaString() {
		return experienciaString;
	}
	public void setExperienciaString(String experienciaString) {
		this.experienciaString = experienciaString;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experienciaString="
				+ experienciaString + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", serieMatriculado=" + serieMatriculado + "]";
	}
	@Override
	/*Conforme foi criado metodo Abstract na classe pai, é obrigatorio criar também nas classes filhas 
	 * como exemplo abaixo
	 */
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80*0.9;
	}
	
	
	
	
	}


