package br.com.poo.sistemabancario.principal;

import br.com.poo.sistemabancario.contas.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Conta minhaConta2 = new Conta();
		Conta minhaConta3 = new Conta();
		
		minhaConta.titular = "Jonathan";
		minhaConta.saldo = 1000.0;
		minhaConta.numero = 1;
		
		
		minhaConta2.titular = "Caroline";
		minhaConta2.saldo = 2500.00;
		minhaConta2.numero = 2;
		
		minhaConta3.titular = "Joaquim";
		minhaConta3.saldo = 1500.00;
		minhaConta3.numero = 3;
		
		minhaConta.transferir(minhaConta3, 1200);
		minhaConta2.transferir(minhaConta3, 400);
		
		
		System.out.println("Saldo atual R$ " + minhaConta.saldo 
				+ "\nNome do titular: " + minhaConta.titular
				+ "\nNúmero da conta: " + minhaConta.numero);
		
		System.out.println("Saldo atual R$ " + minhaConta2.saldo 
				+ "\nNome do titular: " + minhaConta2.titular
				+ "\nNúmero da conta: " + minhaConta2.numero);
		
		System.out.println("Saldo atual R$ " + minhaConta3.saldo 
				+ "\nNome do titular: " + minhaConta3.titular
				+ "\nNúmero da conta: " + minhaConta3.numero);

	}

}
