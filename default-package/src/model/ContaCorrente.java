package model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            super.sacar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
