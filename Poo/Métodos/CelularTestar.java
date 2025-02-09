package Métodos;

public class CelularTestar {
	public static void main(String[] args) {
		
		Celular c1 = new Celular();
		
		c1.nome = "Iphone 11";
		c1.sistemaOperacional = "IOS";
		c1.tamanhoTela = 5.4f;
		
        Celular c2 = new Celular();
		
		c2.nome = "Iphone 12 pro max";
		c2.sistemaOperacional = "IOS";
		c2.tamanhoTela = 7.7f;
		
		 Celular c3 = new Celular();
			
         c3.nome = "Iphone 14 pro max";
	     c3.sistemaOperacional = "IOS";
		 c3.tamanhoTela = 8.7f;
		
		
		System.out.println("Novo modelo de " + c1.nome + " com sistema operacional " + c1.sistemaOperacional + " com tamanho de tela " + c1.tamanhoTela);
		System.out.println("Novo modelo de " + c2.nome + " com sistema operacional " + c2.sistemaOperacional + " com tamanho de tela " + c2.tamanhoTela);
		System.out.println("Novo modelo de " + c3.nome + " com sistema operacional " + c3.sistemaOperacional + " com tamanho de tela " + c3.tamanhoTela);
	}
}
