package Poo;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner (System.in);
		
		int N;
		System.out.println("Quantos numeros voce vai digitar ?");
	    N = scn.nextInt();
		
		int [] vet = new int [N];
		
		for(int i = 0; i < N; i++) {
			System.out.println("Digite um número: ");
			 vet[i] = scn.nextInt();	
		}
		
		 System.out.println("NUMEROS NEGATIVOS:");

		    for (int i=0; i< N; i++) {
		        if (vet[i] < 0) {
		        	System.out.println(vet[i]);
		        }
		    }
		    
		    scn.close();
		
	}
}
