public class Conta implements IConta {

/**  agencia numero não precisam de setters
 *  porque pessoas de fora não podem mudar a agencia ou a conta */

private static final int AGENCIA_PADRAO = 1;
private static int SEQUENCIAL = 1;

protected int agencia;
protected int numero;
protected double saldo;

public Conta() {
    this.agencia = Conta AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
}

@Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        } 
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
         if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido."); 
        } 
    

    public double getSaldo() {
        return saldo;
    } 

    protected void imprimirInfosComuns() {

        System.out.println(String.format ("Agencia: %d", this.agencia));
        System.out.println(String.format ("Numero: %d", this.numero));
        System.out.println(String.format ("Saldo: %.2f", this.saldo));
    }
  }
}