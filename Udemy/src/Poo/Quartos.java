package Poo;

import java.util.Locale;
import java.util.Scanner;

public class Quartos {
	
	private String name;
	private String email;
	
	public Quartos(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return  name + ", " + email;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		Quartos [] vect = new Quartos[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = scn.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: " );
			String name = scn.next();
			scn.nextLine();
			System.out.print("Email: " );
			String email = scn.next(); 
			System.out.print("Room: " );
			int roomNumber = scn.nextInt(); 
			Quartos q = new Quartos(name, email);
			
			vect[roomNumber] = new Quartos(name, email);	
		}
		System.out.println();
		System.out.println("Quartos ocupado: ");	
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null)
			System.out.println(i + ":" + vect[i]);
		}
	}
	
	
}
