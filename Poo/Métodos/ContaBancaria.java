package Métodos;

public class ContaBancaria {
    // Atributos da classe
    private String titular;
    private float saldo;

    // Construtor da classe
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0f; // Inicializando o saldo com 0
    }

    // Método para depositar valor na conta
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar valor da conta
    public void sacar(float valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    // Método para exibir o saldo atual
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("Maria");

        // Testando os métodos
        conta.exibirSaldo();  // Saldo atual: R$ 0.0
        conta.depositar(1000);
        conta.exibirSaldo();  // Saldo atual: R$ 1000.0
        conta.sacar(200);
        conta.exibirSaldo();  // Saldo atual: R$ 800.0
        conta.sacar(1000);    // Saldo insuficiente para o saque.
    }
}

