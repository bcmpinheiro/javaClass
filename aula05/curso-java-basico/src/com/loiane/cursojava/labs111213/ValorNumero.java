package com.loiane.cursojava.labs111213;

import java.util.Scanner;

public class ValorNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero aleat�rio:");
		
		int valor = scan.nextInt();
		
		System.out.println("Voc� digitou o n�mero: " + valor);

	}

}
