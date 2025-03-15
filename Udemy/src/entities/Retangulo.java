package entities;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
	public double largura;
	public double altura;
	
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	public double diagonal() {
		return Math.sqrt((largura * largura) + (altura * altura));
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Configura o Java para usar ponto (.) como separador decimal
		Scanner scn = new Scanner(System.in);
		Retangulo reta = new Retangulo();
		  
		System.out.println("Enter width and height: ");
		reta.largura = scn.nextDouble();
		reta.altura = scn.nextDouble();
		  
		System.out.println("Area = " + reta.area());
		System.out.println("Perimetro = " + reta.perimetro());
		System.out.println("Digonal = " + reta.diagonal());

		scn.close();
		
	}
}
