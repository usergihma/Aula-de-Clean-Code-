package lpaClean_Code;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double valor;

		System.out.println("Informe um valor :");
		valor = ler.nextDouble();

		if (valor % 5 == 0) {
			System.out.println("O número " + valor + " é multiplo de 5");//Estrutura de repetição
		}
		if (valor % 5 != 0) {
			System.out.println("O número " + valor + " não é multiplo de 5");//Estrutura de repetição
			ler.close();
		}

	}

}