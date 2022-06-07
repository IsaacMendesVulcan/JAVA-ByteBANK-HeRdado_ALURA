//Gerente extends Funcionario (Gerente tb � um funcion�rio/herda) assina o contrato autenticavel, � um autenticvel
public class Gerente extends Funcionario implements Autenticavel {


	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario(); //super significa que vai puxar da classe m�e
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	
	

}
 