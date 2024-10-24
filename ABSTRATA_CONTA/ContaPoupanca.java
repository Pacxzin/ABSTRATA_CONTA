// Classe que representa uma conta poupança, estende ContaBancaria
public class ContaPoupanca extends ContaBancaria {
    private double taxaSaque; // Taxa para saques
    private double taxaDeposito; // Taxa para depósitos

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(double saldo, double taxaSaque, double taxaDeposito) {
        this.saldo = saldo;
        this.taxaSaque = taxaSaque;
        this.taxaDeposito = taxaDeposito;
    }

    // Método para realizar saque
    @Override
    public boolean saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor + taxaSaque; // Deduz o valor do saque e a taxa
            return true;
        }
        return false; // Saque não permitido
    }

    // Método para realizar depósito
    @Override
    public void deposito(double valor) {
        saldo += valor - taxaDeposito; // Adiciona o valor do depósito menos a taxa
    }

    // Método para consultar saldo
    @Override
    public double consulta() {
        return saldo; // Retorna o saldo atual
    }
}