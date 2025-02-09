package Métodos;

public class CalcularNumero {
	
	// Método que calcula o quadrado de um número
    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        // Testando o método calcularQuadrado
        int numero = 9;
        int resultado = calcularQuadrado(numero);

        System.out.println("O quadrado de " + numero + " é " + resultado);
    }

}
