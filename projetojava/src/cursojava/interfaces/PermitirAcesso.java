package cursojava.interfaces;


/*Essa interfaces será nosso contrato de autenticação*/

public interface PermitirAcesso {

	
	
/*Criamos duas String na classe INTERFACES que depois  será usada em permitir 
 * acesso 
 */
public boolean  autenticar(String login,String senha);
public boolean autenticar ();

	
}
