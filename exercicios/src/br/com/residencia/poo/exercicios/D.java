package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {

		String nome, disciplina;
		double nota, totalNotas = 0.0, media;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();

		System.out.println("Digite sua disciplina: ");
		disciplina = ler.nextLine();

		for (int cont = 1; cont <= 3; cont++) {
			System.out.println("Insira a nota" + cont + ": ");
			nota = ler.nextDouble();
			totalNotas += nota;
		}

		media = totalNotas / 3;
		System.out.println("Olá, " + nome + "!");
		System.out.println("Na disciplina " + disciplina + " a sua média é " + media + "!");

		ler.close();
	}

}
