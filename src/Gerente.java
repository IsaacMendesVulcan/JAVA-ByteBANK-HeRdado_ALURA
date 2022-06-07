//Gerente extends Funcionario (Gerente tb é um funcionário/herda) assina o contrato autenticavel, é um autenticvel
public class Gerente extends Funcionario implements Autenticavel {


	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario(); //super significa que vai puxar da classe mãe
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
 