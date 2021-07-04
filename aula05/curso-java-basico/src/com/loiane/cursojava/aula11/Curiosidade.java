package com.loiane.cursojava.aula11;

public class Curiosidade {

	public static void main(String[] args) {
		
		int var1 = 2147483647;
		
		int var2 = 100;
		
		System.out.println(var1 + var2);
		
		// a saída desse programa é negativa
		// ele subtraí os valores e coloca
		// o sinal de menos.
		// -2147483549
		// quando excede o limite ele traz 
		// o sinal de menor valor
		// para todos os tipos inteiros no Java
		// ele é uma roleta e ao ser somado
		// volta para o menor valor (negativos)
		

	}

}
