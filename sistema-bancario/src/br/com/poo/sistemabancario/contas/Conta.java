package br.com.poo.sistemabancario.contas;

import java.util.Scanner;

public class Conta {

	public int numero;
	public String titular;
	private double saldo;

	public boolean sacar(double valor) {
		
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}

	public boolean depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido!");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	public void transferir(Conta destino, double valor) {
		// this.saldo = this.saldo - valor;
		// destino.saldo = destino.saldo + valor;
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente");
		} else {
			this.sacar(valor);
			destino.depositar(valor);
		}
	
		
		
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	  
//	public String brenda(String x) {
//		System.out.println(this.titular+" "+x);
//		return "Brenda Folly";
//	}

	/*
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("informe o número da conta para transferencia: "); numero
	 * = sc.nextInt();
	 * 
	 * double novoSaldo = this.saldo - valor; this.saldo = novoSaldo; }
	 * 
	 * double novoSaldo = this.saldo + valor; this.saldo = novoSaldo
	 */

}

