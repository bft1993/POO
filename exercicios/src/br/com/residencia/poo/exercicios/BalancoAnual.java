package br.com.residencia.poo.exercicios;

public class BalancoAnual {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosAbril = 19000;
		int gastosMaio = 21000;
		int gastosJunho = 23000;
		int gastosJulho = 24500;
		int gastosAgosto = 21500;
		int gastosSetembro = 24000;
		int gastosOutubro = 18000;
		int gastosNovembro = 20500;
		int gastosDezembro = 30000;

		int gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
		int gastoSemestral = gastosTrimestral + gastosAbril + gastosMaio + gastosJunho;
		int gastoAnual = gastoSemestral + gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro + gastosNovembro + gastosDezembro;

		System.out.println("O Balanço Trimestral foi de: R$ " + gastosTrimestral);
		System.out.println("O Balanço Semestral foi de: R$ " + gastoSemestral);
		System.out.println("O Balanço Anual foi de: R$ " + gastoAnual);

	}

}
