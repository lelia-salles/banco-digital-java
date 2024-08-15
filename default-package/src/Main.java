import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import service.BancoService;
import util.Utils;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alice", "123.456.789-00");
        Cliente cliente2 = new Cliente("Bob", "987.654.321-00");

        Conta contaCorrente = new ContaCorrente("001", cliente1, 500.0);
        Conta contaPoupanca = new ContaPoupanca("002", cliente2);

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(2000.0);

        BancoService bancoService = new BancoService();
        bancoService.transferir(contaCorrente, contaPoupanca, 300.0);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        // Usando lambda para imprimir uma mensagem
        Utils.executarOperacao(mensagem -> System.out.println(mensagem), "Operação concluída com sucesso!");
    }
}
