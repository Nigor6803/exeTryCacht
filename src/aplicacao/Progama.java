package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entidade.Conta;

public class Progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		System.out.print("NUMERO DA CONTA: ");
		int numero = edd.nextInt();
		edd.nextLine();
		System.out.print("TITULAR:");
		String nome = edd.nextLine();
		System.out.print("VALOR INICIAL: R$");
		double valor = edd.nextDouble();
		System.out.print("LIMITE PARA DEPOSITO: R$");
		double limite = edd.nextDouble();
		
		Conta conta = new Conta(numero,nome,valor,limite);
		
		System.out.print("INFORMAR VALOR DE SAQUE: R$");
		double quantia = edd.nextDouble();
		
		try {
		conta.retirada(quantia);
		System.out.printf("NOVO SALDO: R$ %.2f%n", conta.getQuantidade());}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println(conta);
		edd.close();

	}

}
