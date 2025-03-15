package Poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
	
	
	private  Integer id;
	private String name;
	private Double salario;
	

	public Funcionarios () {
	}

	public Funcionarios(Integer id, String name, Double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}

    public void increaseSalary(double percentage) {
    	 salario += salario * percentage / 100.0;
    }
    
    @Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("How many employees will be registered?");
		int quartos = scn.nextInt();
		
		List<Funcionarios> list = new ArrayList<>();

		
		for(int i = 1; i <= quartos; i++) {
			System.out.println();
			System.out.println("Employees #" + i);
			System.out.print("Id:");
			Integer id = scn.nextInt();
			scn.nextLine();  // Consome a quebra de linha pendente
			System.out.print("Name: ");
			String name = scn.nextLine();  // Agora lê corretamente o nome
			System.out.print("Salario:");
			Double salario = scn.nextDouble();

			Funcionarios fun = new Funcionarios(id, name, salario);
			
			list.add(fun);
		}
		
		System.out.println("Enter the employee id that will have salary increase :");
		int idsalary = scn.nextInt();
		Funcionarios fun = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if(fun == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = scn.nextDouble();
			//list.get(pos).increaseSalary(percent);
			fun.increaseSalary(percent);
		}
		
		System.out.println();	
		System.out.println("List of employees:");
		for(Funcionarios de : list) {
			System.out.println(de);
		}
		
	}
	
	public static Integer position(List<Funcionarios> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
