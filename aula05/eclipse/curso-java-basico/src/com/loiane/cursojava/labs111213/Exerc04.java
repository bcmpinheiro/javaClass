package com.loiane.cursojava.labs111213;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		int i;
		Scanner scan = new Scanner (System.in);
		
		float notas[] = new float[4];
		
		try {
			
			for (i = 0 ; i < 4; i++) {
				System.out.println("Digite a nota " + (i+1));
				
				float nota = scan.nextFloat();
				
				notas[i] = nota;
			}
			
			float media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4; 
			
			System.out.println("Notas inseridas pelo usuário");
			System.out.println("============================");
			System.out.println("Nota 01: " + notas[0]);
			System.out.println("Nota 02: " + notas[1]);
			System.out.println("Nota 03: " + notas[2]);
			System.out.println("Nota 04: " + notas[3]);
			System.out.println("============================");
			System.out.println("Média: " + media);
			
		} catch(Exception e) {
			System.out.println("Deu ruim");
			System.exit(0);
		}
				
		}

}
