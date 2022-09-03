/*package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class DinamicaErros {

	String nome;
	int idade;

	public static void main(String[] args) {
			Scanner tantoFaz = new Scanner(System.in);
			String nome;
			Double idade;
			
			System.out.println("Qual é o seu nome?");
			nome = tantoFaz.nextLine();
			
			System.out.println("\nQual é a sua idade?");
			idade = tantofaz.nextDouble();
			
			System.out.println("Seu nome é "+ idade+ " e sua idade é "+ nome + "!");
			
			ler.close();

		}

}*/

/*package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class DinamicaErros {

	public static void main(Integer[] args) {

		Scanner ler = new Scanner(System.in);
		integer temperatura;

		System.out.println("Informe a temperatura em Graus Celsius: ");
		temperatura = ler.nextInteger();

		System.out.println("A temperatura em Fahrenheit é: " + temperatura * 1.8 + 32);

		ler.close();
	}

}*/

package residencia.com.br/poo.exercicios;

import java.util.Scanner;

public class DinamicaErros {

	public static void main(String[] args) {

		string nome, disciplina;
		double nota, totalNotas = 0.0, media;
		Scanner ler = new Scanner();

		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();

		System.out.println("Digite sua disciplina: ");
		disciplina = ler.nextLine();

		for (int cont = 1 +  cont <= 3 + cont++) {
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

