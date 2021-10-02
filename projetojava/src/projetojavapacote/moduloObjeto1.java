package projetojavapacote;

import javax.swing.JOptionPane;

import projetojavapacote.classesauxiliares.FuncaoAutenticacao;

public class moduloObjeto1 {

	public static void main(String[] args) {

		/*  INTERFACES E CONSTRUTORES
		 *
		 */
		String login = JOptionPane.showInputDialog(" Informe o Login ");
		String senha = JOptionPane.showInputDialog("Informe a Senha ");
		
	
		
		
	/* Será Travado o contrato para autorizar somente quem realmente tem 
	 * o contrato 100% Regitimo
	 * será feito uma classe a mais que vai receber qualquer classe que implemente essa interface */
		if (new FuncaoAutenticacao( new Diretor(senha, senha)).autenticar()) { /* vamos travar o contrato para autorizar somente quem tem o contrato 100% legitimom*/
			JOptionPane.showMessageDialog(null, "Carregando Seu Sistema");
			System.out.println("Acesso Concluído !! Bem vindo ao Inicio de Tudo Programador");

		}else {
			JOptionPane.showMessageDialog(null , "Login ou Senha Incorreto");
		
	}
}}
