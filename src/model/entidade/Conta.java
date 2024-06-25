package model.entidade;

import exception.ExceptionDomain;

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
	
	public void validaçãoDeMovimentação(double quantia) {
		if(quantia>getLimiteMovimento()) {
			throw new ExceptionDomain("ERRO: LIMITE DE SAQUE EXCEDIDO");
		}if(quantia>quantidade) {
			throw new ExceptionDomain("ERRO: SALDO INSUFICIENTE");
		} 
	}
	
	public void deposito(Double quantia) {
		quantidade += quantia;				
	}
	
	public void retirada(Double quantia) {
		validaçãoDeMovimentação(quantia);
		quantidade -= quantia;				
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ENTRE COM OS DADOS DA CONTA");
		sb.append(" - NUMERO DA CONTA: "+ conta);
		sb.append(" - TITULAR: "+ nome);
		sb.append(" - VALOR DA CONTA: R$"+quantidade);
		sb.append(" - LIMITE PARA RETIRADA: R$"+ limiteMovimento);
		
		return sb.toString();
	}
}
