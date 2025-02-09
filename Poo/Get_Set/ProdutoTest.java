package Get_Set;

public class ProdutoTest {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		p1.setValor(2434.34);
		p1.setNome("Tenis");	
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Valor: " + p1.getValor());
	}
}
