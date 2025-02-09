package Métodos;

public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	 public void aumentarSalario(double percentagem) {
	        if (percentagem > 0) {
	            double aumento = salario * (percentagem / 100);
	            salario += aumento;
	            System.out.println("Salário aumentado em " + percentagem + "%.");
	        } else {
	            System.out.println("A porcentagem de aumento deve ser maior que zero.");
	        }
	    }

	    // Método para exibir o salário atual
	    public void exibirSalario() {
	        System.out.println("Salário atual de " + nome + ": R$ " + salario);
	    }

	    // Método principal para testar a classe
	    public static void main(String[] args) {
	        // Criando um objeto da classe Funcionario
	        Funcionario funcionario1 = new Funcionario("Carlos", 3000.00);

	        // Exibindo o salário atual
	        funcionario1.exibirSalario(); // Saída: Salário atual de Carlos: R$ 3000.0

	        // Aumentando o salário
	        funcionario1.aumentarSalario(10); // Aumenta 10%
	        funcionario1.exibirSalario(); // Saída: Salário atual de Carlos: R$ 3300.0
	    }
	}
