package service;

import model.Conta;

public interface OperacoesBancarias {
    void transferir(Conta origem, Conta destino, double valor);
}
