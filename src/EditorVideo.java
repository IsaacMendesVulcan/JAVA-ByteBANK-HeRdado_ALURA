//Gerente extends Funcionario (Gerente tb é um funcionário/herda)
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando o método de bonificacao do Editor de video");
		return 150; //super significa que vai puxar da classe mãe
	} 
		
	
	
	

}
