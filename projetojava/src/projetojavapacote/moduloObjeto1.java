package projetojavapacote;

import javax.swing.JOptionPane;

import cursojava.interfaces.PermitirAcesso;

public class moduloObjeto1 {

	public static void main(String[] args) {

		/*  Criamos as String e colocamos o Metodo JOptionPane para Informa Login e Senha
		 * automaticamente ele ira verificar se está igual ao (tudo que foi declarado no return, na classe Secretario)
		 */
		String login = JOptionPane.showInputDialog(" Informe o Login ");
		String senha = JOptionPane.showInputDialog("Informe a Senha ");
		
		
		
		
	/* Criamos o Objeto e trazemos login e senha em uma mesma linha */
		if (new Secretario ().autenticar(login, senha)) {
			JOptionPane.showMessageDialog(null, "Carregando Seu Sistema");
			System.out.println("Acesso Concluído !! Bem vindo ao Inicio de Tudo Programador");

		}else {
			JOptionPane.showMessageDialog(null , "Login ou Senha Incorreto");
		}
	}
}
