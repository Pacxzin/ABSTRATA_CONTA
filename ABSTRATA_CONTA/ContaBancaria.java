// Classe abstrata que representa uma conta bancária
public abstract class ContaBancaria {
    protected double saldo; // Saldo da conta

    // Método abstrato para saque
    public abstract boolean saque(double valor);

    // Método abstrato para depósito
    public abstract void deposito(double valor);

    // Método abstrato para consulta do saldo
    public abstract double consulta();
}