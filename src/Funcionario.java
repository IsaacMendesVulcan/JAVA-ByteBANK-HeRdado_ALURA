
//nao pode instancar dessa classe, pq é abstrata, n pode da new
public abstract class Funcionario {
		
	private String nome;
	private String cpf;
	private double salario; 
	//(protected significa publico p/ os filhos, privado para os outros)

	//metodo sem corpo, nao há implementação
	public abstract double getBonificacao();
	
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
