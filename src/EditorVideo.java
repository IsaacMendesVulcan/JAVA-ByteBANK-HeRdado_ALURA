//Gerente extends Funcionario (Gerente tb � um funcion�rio/herda)
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando o m�todo de bonificacao do Editor de video");
		return 150; //super significa que vai puxar da classe m�e
	} 
		
	
	
	

}
