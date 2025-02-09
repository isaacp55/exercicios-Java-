package Métodos;

public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;
    private String cidade;

    // Construtor da classe
    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    // Método para apresentar a pessoa
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e moro em " + cidade + ".");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25, "São Paulo");
        
        // Chamando o método apresentar
        pessoa1.apresentar();
    }
}

