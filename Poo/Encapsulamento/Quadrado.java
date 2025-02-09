package Encapsulamento;

public class Quadrado implements FiguraGeometrica {
	
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(lado, 2);
	}
	
	public int getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}

}
