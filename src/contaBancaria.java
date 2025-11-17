public class contaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;
}

//Construtor

public contaBancaria( String titular ) {

    this.titular = titular;
    this.numeroConta = numeroConta;
    this.saldo = 0;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
        } 
        else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } 
        else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("---- INFORMAÇÕES DA CONTA ----");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("--------------------------------");
    }
}






