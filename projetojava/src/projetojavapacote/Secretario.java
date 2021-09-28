package projetojavapacote;

import cursojava.interfaces.PermitirAcesso;

/*Depois de termos criado pacote cursojava.interfaces,depois
 * other interfaces, colocamos o metodo imlements. Lembrando que A classe PermitirAcesso é uma classe interface.
 * Somente A classe Secretário tera acesso ou saberá que possui um autenticar não interferindo nas outras classes
 */
public class Secretario extends pessoa implements PermitirAcesso {

/*Classe Filha da herança pessoa.java sempre utilizando no inicio " extends "*/
		
	private String	registro;
	private String nivelCargo;
	private String experienciaString;
	
	private String login;
	private String senha;
		
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
	
	public boolean autenticar(String login, String senha) {
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		
		return false;
	}
	
	
	
	
	}


