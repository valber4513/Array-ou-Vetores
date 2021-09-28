package projetojavapacote;

public class testandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("valber");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setNome(" Alex ");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setNome("jorge");
		secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + "____" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		/* Aqui trazemos a classe metodo Abstrato que criamos */
		System.out.println("Sal�rio Aluno R$ = " + aluno.salario());
		System.out.println("Sal�rio Diretor R$ = " + diretor.salario());
		System.out.println("Sal�rio Secret�rio R$ = " + secretario.salario());

		/* Polimorfismo */
		pessoa Pessoa = new Aluno();
		Pessoa = secretario;

		/*
		 * Ele aceita as tr�s classes porque todas est�o ligadas a Classe Pai ( Pessoa )
		 */
		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	public static void teste(pessoa Pessoa) {
		System.out.println("Essa pessoa � Demais = " + Pessoa.getNome() + "e o sal�rio � de  = " + Pessoa.salario());
	}
}
