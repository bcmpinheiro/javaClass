package com.loiane.cursojava.labs111213;

import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite dois números para efetuarmos uma SOMA:");
		
		int valor01 = scan.nextInt();
		int valor02 = scan.nextInt();
		
		System.out.println(valor01 + valor02);

	}

}