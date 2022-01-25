package com.dio.bootcampcognizantjava.bancodigital;

public interface InterfaceConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(Double  valor,Conta contaDestino);
    void imprimirSaldo();

}
