package projetojavapacote;


public class Diretor extends pessoa{
	
		/*Classe filha da herança pessoa.java*/
		
		private String registroEducacao;
		private String tempoDirecao;
		private String titulacao;
		
		
		
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
		
		
		
	}


