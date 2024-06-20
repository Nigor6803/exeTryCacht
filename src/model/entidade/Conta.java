package model.entidade;

public class Conta {
	private Integer conta;
	private String nome;
	private Double quantidade;
	private Double limiteMovimento;

	public Conta() {
	}

	public Conta(Integer conta, String nome, Double quantidade, Double limiteMovimento) {
		this.conta = conta;
		this.nome = nome;
		this.quantidade = quantidade;
		this.limiteMovimento = limiteMovimento;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getQuantidade() {
		return quantidade;
	}
	
	public Double getLimiteMovimento() {
		return limiteMovimento;
	}
	
	public void setLimiteMovimento(Double limiteMovimento) {
		this.limiteMovimento = limiteMovimento;
	}
	
	public void deposito(Double deposito) {
		double soma = getQuantidade();
		soma = quantidade+deposito;				
	}
	
	public void retirada(Double retirada) {
		double soma = getQuantidade();
		soma = quantidade-retirada;				
	}
	
	@Override
	public String toString() {
		return "ENTRE COM OS DADOS DA CONTA"
				+"NUMERO DA CONTA: "+ conta +"/n"
				+"TITULAR: "+ nome+"/n"
				+"VALOR DA CONTA: R$"+quantidade+"/n"
				+"LIMITE PARA RETIRADA: R$"+ limiteMovimento+"/n"
				+"                  /n";
	}
}
