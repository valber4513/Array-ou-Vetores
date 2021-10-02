package projetojavapacote;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends pessoa implements PermitirAcesso{
	
		/*Classe filha da herança pessoa.java*/
		
		private String registroEducacao;
		private String tempoDirecao;
		private String titulacao;
		
		/* para validar o Diretor, nesse caso tera que possui os mesmo atributos de secretário*/
		private String login;
		private String senha;
		
		public Diretor (String login, String senha){
			this.login = login;
			this.senha = senha;
		}
		
	
		
		public String getRegistroEducacao() {
			return registroEducacao;
		}
		public void setRegistroEducacao(String registroEducacao) {
			this.registroEducacao = registroEducacao;
		}
		public String getTempoDirecao() {
			return tempoDirecao;
		}
		public void setTempoDirecao(String tempoDirecao) {
			this.tempoDirecao = tempoDirecao;
		}
		public String getTitulacao() {
			return titulacao;
		}
		@Override
		public String toString() {
			return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
					+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", serieMatriculado=" + serieMatriculado + "]";
		}
		public void setTitulacao(String titulacao) {
			this.titulacao = titulacao;
		}
		@Override
		/*Conforme foi criado metodo Abstract na classe pai, é obrigatorio criar também nas classes filhas 
		 * como exemplo abaixo
		 */
		public double salario() {
			// TODO Auto-generated method stub
			return 3900.78;
		}
		
		public boolean autenticar(String login, String senha) {
			this.login = login;
			this.senha = senha;
			
			return autenticar();
		}


		public boolean autenticar() {

			return login.equals("valber") &&  senha.equals("valber");
		
	}}


