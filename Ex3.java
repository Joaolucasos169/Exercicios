package controle;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * Criar um programa que receba duas notas parciais, calcular a média final. Se
		 * a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a
		 * nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
		 * caso contrário imprime no console "Reprovado"
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println(media + " Aprovado");
		} else if (media >= 4) {
			System.out.println(media + " Recuperação");
		} else {
			System.out.println(media + " Reprovado");
		}
		entrada.close();

}
}
