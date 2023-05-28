package controle;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
// Refatorar o exercício 04, utilizando a estrutura switch.

		int Contador = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número: ");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				Contador++;
			}
		}

		switch (Contador) {
		case 0:

			System.out.println("O número " + numero + " É primo");
			break;

		default:
			System.out.println("O número " + numero + " não é primo!");

		}
		entrada.close();
	}
}
