//Gerente extends Funcionario (Gerente tb � um funcion�rio/herda)
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o m�todo de bonificacao do Designer");
		return 200; //super significa que vai puxar da classe m�e
	} 
		
	

	
	

}
