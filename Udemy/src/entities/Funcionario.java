package entities;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
	
	public String name;
	public double SalarioBruto;
	public double Imposto;
	private double porcentagem;
	
	// Método para calcular o salário líquido
	public double SalarioLiquido() {
		return SalarioBruto - Imposto;
	}
	
	// Método para aumentar o salário com base na porcentagem
	public void AumentarSalario(double porcentagem) {
		SalarioBruto += SalarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + SalarioLiquido();
		}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Usa ponto (.) como separador decimal
		Scanner scn = new Scanner(System.in);

		Funcionario fun = new Funcionario();
		
		System.out.print("Name: ");
		fun.name = scn.next();
		
		System.out.print("Salario bruto: ");
		fun.SalarioBruto = scn.nextDouble();
		
		System.out.print("Imposto: ");
		fun.Imposto = scn.nextDouble();
		
		System.out.println("Funcionário: " + fun);
		
		System.out.print("Escolha a porcentagem para aumentar o salario: ");
		double porcentagem = scn.nextDouble();
		
		// Aumenta o salário com base na porcentagem
		fun.AumentarSalario(porcentagem);
		
		System.out.println("Dados atualizados: " + fun);
		

		scn.close();
	}
}
