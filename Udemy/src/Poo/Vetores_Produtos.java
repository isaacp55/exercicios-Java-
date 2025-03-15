package Poo;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Produtos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner (System.in);
		
		int n = scn.nextInt();
		Product [] vet = new Product[n];
		
		for(int i = 0; i < n; i++) {
			scn.nextLine();
			String name = scn.next();
			double price = scn.nextDouble();
			vet[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += vet[i].getPrice();
		}
		
		double avg = soma / n;
		
		System.out.println("Média Preços: " + avg);

		
	}
}
