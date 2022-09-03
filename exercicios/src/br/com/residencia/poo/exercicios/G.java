package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero1, numero2;

		System.out.println("Digite o primeiro número: ");
		numero1 = ler.nextInt();

		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextInt();

		System.out.println("Soma: " + (numero1 + numero2));

		System.out.println("Subtração: " + (numero1 - numero2));

		System.out.println("Multiplicação: " + (numero1 * numero2));

		System.out.println("Divisão: " + (numero1 / numero2));

		ler.close();

	}

}
