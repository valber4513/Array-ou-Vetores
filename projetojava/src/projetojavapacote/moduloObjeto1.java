package projetojavapacote;

import javax.swing.JOptionPane;

import projetojavapacote.classesauxiliares.FuncaoAutenticacao;

public class moduloObjeto1 {

	public static void main(String[] args) {
		
		try {/* IMPORTANCIA DO TRY, dentro dele  fica toda regra de negocio, com esse c�digo voc� poder�
		capturar qualqur erro e corrigir de forma mais rapida */
		
		
		String login = JOptionPane.showInputDialog(" Informe o Login ");
		String senha = JOptionPane.showInputDialog("Informe a Senha ");

		
		if (new FuncaoAutenticacao(new Diretor(senha, senha))
				.autenticar()) { 
									 
			JOptionPane.showMessageDialog(null, "Carregando Seu Sistema");
			System.out.println("Acesso Conclu�do !! Bem vindo ao Inicio de Tudo Programador");

		} else {
			JOptionPane.showMessageDialog(null, "Login ou Senha Incorreto");
		}
		
		
		}catch (Exception e) {/*fechamos o C�digo com (Exception e, e.printStackTrace), aqui o Sistema ira o local do erro, isso � fundamental
		para o programador encontrar o erro e corrigir, caso n�o seja feito ser� necess�rio olhar linha por linha*/
		e.printStackTrace();
		System.out.println("Menssagem:   " + e.getMessage() );
		/*Com esse C�digo voce
		imprimi o Erro, traz a msg por exemplo , null */
		
		/*a Seguir,uma forma de deixar os Erros impressos mais customizado , ou seja vai trazer na ordem e organizado qual � qual */
		for ( int pos = 0; pos <= e.getStackTrace().length; pos++) {
		System.out.println("Classe do Erro  = " + e.getStackTrace()[pos].getClassName());
		System.out.println("M�todo do Erro  = " + e.getStackTrace()[pos].getMethodName());
		System.out.println("Linha do Erro  = " + e.getStackTrace()[pos].getLineNumber());
		}
		}

	}
}
