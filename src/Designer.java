//Gerente extends Funcionario (Gerente tb é um funcionário/herda)
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o método de bonificacao do Designer");
		return 200; //super significa que vai puxar da classe mãe
	} 
		
	

	
	

}
