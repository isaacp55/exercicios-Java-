package Métodos;

public class Carro {


	private String marca;
	private String modelo;
	private int ano;
	
	public Carro(String marca,String modelo, int ano ){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirInformacoes() {
		System.out.println("Carro: " + marca + " " + modelo + ", Ano: "+ ano);
	}
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Toyota", "Corolla", 2022);
		
		c1.exibirInformacoes() ; 
		
	}
}
