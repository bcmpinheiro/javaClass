package com.loiane.cursojava.labs111213;

import java.util.Scanner;

public class ValorNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número aleatório:");
		
		int valor = scan.nextInt();
		
		System.out.println("Você digitou o número: " + valor);

	}

}
