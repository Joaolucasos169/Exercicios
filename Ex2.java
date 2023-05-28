package controle;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

// Criar um programa informa se o ano atual é um ano bissexto; 

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " É um ano Bissexto");

		} else {
			System.out.println(ano + " Não é um ano Bissexto");
		}
		entrada.close();

	}
}
