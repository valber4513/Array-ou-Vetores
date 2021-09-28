package projetojavapacote;

import javax.swing.JOptionPane;

import cursojava.interfaces.PermitirAcesso;

public class moduloObjeto1 {

	public static void main(String[] args) {

		/*  INTERFACES E CONSTRUTORES
		 *
		 */
		String login = JOptionPane.showInputDialog(" Informe o Login ");
		String senha = JOptionPane.showInputDialog("Informe a Senha ");
		
		PermitirAcesso permitirAcesso = new Secretario (login, senha);
		
		
	/* Criamos o Objeto e trazemos login e senha em uma mesma linha */
		if ( permitirAcesso.autenticar()) {
			JOptionPane.showMessageDialog(null, "Carregando Seu Sistema");
			System.out.println("Acesso Concluído !! Bem vindo ao Inicio de Tudo Programador");

		}else {
			JOptionPane.showMessageDialog(null , "Login ou Senha Incorreto");
		
	}
}}
