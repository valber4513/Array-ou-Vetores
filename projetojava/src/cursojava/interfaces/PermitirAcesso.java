package cursojava.interfaces;


/*Essa interfaces ser� nosso contrato de autentica��o*/

public interface PermitirAcesso {

	
	
/*Criamos duas String na classe INTERFACES que depois  ser� usada em permitir 
 * acesso 
 */
public boolean  autenticar(String login,String senha);
public boolean autenticar ();

	
}
