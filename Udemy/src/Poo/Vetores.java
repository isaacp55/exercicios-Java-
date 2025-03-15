package Poo;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner (System.in);
		
		int n = scn.nextInt();
		
		double [] vect = new double [n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = scn.nextDouble();
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double avg = soma / n;
		
		System.out.println("AVERAGE HEIGHT: " + avg);
		
		
		
	}
}
