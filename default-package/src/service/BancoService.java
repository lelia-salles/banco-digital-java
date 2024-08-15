package service;

import model.Conta;

public class BancoService implements OperacoesBancarias {
    @Override
    public void transferir(Conta origem, Conta destino, double valor) {
        if (origem.getSaldo() >= valor) {
            origem.sacar(valor);
            destino.depositar(valor);
        }
    }
}
