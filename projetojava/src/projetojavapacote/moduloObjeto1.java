package projetojavapacote;

import javax.swing.JOptionPane;

public class moduloObjeto1 {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog(" Informe o Login ");
		String Senha = JOptionPane.showInputDialog("Informe a Senha ");

		Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(Senha);

		if (secretario.autenticar()) {
			JOptionPane.showMessageDialog(null, "Carregando Conta");
			System.out.println("Criação de login e" + " Senha de Certo");

		}else {
			JOptionPane.showMessageDialog(null , "Login ou Senha Incorreto");
		}
	}
}
