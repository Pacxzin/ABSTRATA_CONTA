// Classe que representa uma conta corrente, estende ContaBancaria
public class ContaCorrente extends ContaBancaria {
    private double limite; // Limite de crédito da conta
    private double taxaSaque; // Taxa para saques
    private double taxaDeposito; // Taxa para depósitos

    // Construtor da classe ContaCorrente
    public ContaCorrente(double saldo, double limite, double taxaSaque, double taxaDeposito) {
        this.saldo = saldo;
        this.limite = limite;
        this.taxaSaque = taxaSaque;
        this.taxaDeposito = taxaDeposito;
    }

    // Método para realizar saque
    @Override
    public boolean saque(double valor) {
        if (valor <= saldo + limite) {
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