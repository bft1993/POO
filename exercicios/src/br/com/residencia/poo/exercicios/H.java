package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class H {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int temperatura;

		System.out.println("Informe a temperatura em Graus Celsius: ");
		temperatura = ler.nextInt();

		System.out.println("A temperatura em Fahrenheit é: " + ((temperatura * 1.8) + 32));

		ler.close();
	}

}
