package Encapsulamento;

public class App {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(2);
		
		double area = c1.calcularArea();

		System.out.println(area);
		
		
		Quadrado q1 = new Quadrado(5);
		
		System.out.println(q1.calcularArea());
	}
}