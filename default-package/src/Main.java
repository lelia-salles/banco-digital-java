public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(500.00);
        Conta cp = new Contapopanca(100.00);

        cc.depositar(150.00);
        cc.sacar(50.00);
        cc.transferir(200.00, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}