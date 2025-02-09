package Get_Set;

public class App {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Mario");
		pessoa.setAltura(1.9);
		pessoa.setIdade(20);
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getAltura());
	}
}
