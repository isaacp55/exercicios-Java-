package Poo;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner (System.in);
		
		int N, qtdpares;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		N = scn.nextInt();
		
		int [] vet = new int[N];
		
		for(int i = 0; i < N; i++) {
			System.out.println("Digite um numeros:  ");
			vet[i] = scn.nextInt();
		}
		
		
			System.out.println("NUMEROS PARES: ");
			
			 qtdpares = 0;
			
			for(int i = 0; i < N; i++) {
				if(vet[i] % 2 == 0 ) {
					System.out.println(vet[i]);
					 qtdpares++;
				}
			}
			
			System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);
			
	}
}
