package lpaClean_Code;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double n1, n2, soma;
		int senhaMestre, senhaTeste;

		System.out.println("Cadastre uma senha (Apenas números) :");
		senhaMestre = ler.nextInt();

		System.out.println("Digite um número:");
		n1 = ler.nextDouble();
		
		System.out.println("Digite outro número:");
		n2 = ler.nextDouble();

		soma = n1 + n2;

		System.out.println("Digite sua senha para desbloquear a Soma:");
		senhaTeste = ler.nextInt();

		if (senhaTeste == senhaMestre) {//Estrutura de repetição
			System.out.println("A soma é: " + soma );
		}
		if (senhaTeste != senhaMestre) {//Estrutura de repetição
			System.out.println("Erro! Senha incorreta!!");
			ler.close();
		}

	}

}