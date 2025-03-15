package Poo;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scn = new Scanner (System.in);
		
		Triangule x, y;
		x = new Triangule();
		y = new Triangule();
		
		System.out.println("Enter the measures of triangule X: ");
		x.a = scn.nextDouble();
		x.b = scn.nextDouble();
		x.c = scn.nextDouble();
		
		System.out.println("Enter the measures of triangule Y: ");
		y.a = scn.nextDouble();
		y.b = scn.nextDouble();
		y.c = scn.nextDouble();
		
		
		double areaX =  x.area();
		
		
		double areaY = x.area();
		
		System.out.println("Tringle X area: " + areaX);
		System.out.println("Tringle Y area: " + areaY);
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		
		
		
		
		scn.close();
	}
}
