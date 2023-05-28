package controle;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
// Criar um programa que receba um número e diga se ele é um número primo. //

int Contador = 0;		
Scanner entrada = new Scanner(System.in);

System.out.println("Digite o número: ");
int numero = entrada.nextInt();

for (int i = 2; i < numero; i++) {
if(numero % i == 0) {
	Contador++;
}
}

if (Contador == 0) {
	System.out.println("\nO número " + numero + " É primo.");
	
	} else {
		System.out.println("O número " + numero + " Não é primo!");
	}

entrada.close();
	}
}
