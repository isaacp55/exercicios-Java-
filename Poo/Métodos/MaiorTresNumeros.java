package Métodos;

public class MaiorTresNumeros {

	int n1, n2, n3;
	int maior;
	
	int maiorNumero(int n1, int n2, int n3){
		
		if(n1 > n2 && n1 > n3) {
		     maior = n1;
		}else if(n2 > n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		return maior;
	}
	
	public static void main(String[] args) {
		
		MaiorTresNumeros mn = new MaiorTresNumeros();
		
		System.out.println("Maior: " + mn.maiorNumero(21, 234, 323));
		
	}
	
}
