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
		System.out.println("Salário Aluno R$ = " + aluno.salario());
		System.out.println("Salário Diretor R$ = " + diretor.salario());
		System.out.println("Salário Secretário R$ = " + secretario.salario());

		/* Polimorfismo */
		pessoa Pessoa = new Aluno();
		Pessoa = secretario;

		/*
		 * Ele aceita as três classes porque todas estão ligadas a Classe Pai ( Pessoa )
		 */
		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	public static void teste(pessoa Pessoa) {
		System.out.println("Essa pessoa é Demais = " + Pessoa.getNome() + "e o salário é de  = " + Pessoa.salario());
	}
}
