package com.github.jeferson.desafio;
public class DesafioDois {

	public int countNumbers(int inteiros[], int lessThan) {

		int maiorNumero = 0;
		int quantidadeLessThan = 0;
		
		for(int i = 0; i < inteiros.length; i++) {
			for(int j = 0; j < inteiros.length - 1; j++) {
				
				if(inteiros[j] > inteiros[j + 1]) {
					maiorNumero = inteiros[j];
					inteiros[j] = inteiros[j + 1];
					inteiros[j + 1] = maiorNumero;
				}
			}
		}
		
		for(int i = 0; i < inteiros.length; i++) {
			if(inteiros[i] <= lessThan) {
				quantidadeLessThan++;
			}
		}
		
		return quantidadeLessThan;
	}
}