package Poo;

import java.util.Locale;
import java.util.Scanner;

public class conta_bancaria {
	
	public int number;
	public String name;
	public double value;
	public double soma;
	public double retira;
	
	public double depositoValor () {
		return value + soma;
	}
	
	public double retiradaValor () {
		return (depositoValor() - retira) - 5;
	}
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner (System.in);
		
		conta_bancaria cb = new conta_bancaria();
		
		System.out.print("Enter account number: ");
		cb.number = scn.nextInt();
		
		System.out.print("Enter account holder: ");
		cb.name = scn.next();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char letra = scn.next().charAt(0);
	
		if(letra == 'y') {
			System.out.print("Enter initial deposit value: ");
			cb.value = scn.nextDouble();
		}
		else if(letra == 'n') {
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.print("Account " + cb.number + "," + " Holder: " + cb.name + "," + " Balance: " + "$" + cb.value);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		cb.soma = scn.nextDouble();
		
		System.out.println(" Update account data: ");
		System.out.print("Account " + cb.number + "," + " Holder: " + cb.name + "," + " Balance: " + "$" + cb.depositoValor());
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		cb.retira = scn.nextDouble();
		
		System.out.println(" Update account data: ");
		System.out.print("Account " + cb.number + "," + " Holder: " + cb.name + "," + " Balance: " + "$" + cb.retiradaValor());
		
		
		
		
		

	}
}
