package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		String str;

		System.out.println("Diga seu nome: ");
		str = texto.nextLine();
		System.out.println("Olá," + str + "!");

		texto.close();

	}

}
