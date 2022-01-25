package com.dio.bootcampcognizantjava.bancodigital;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
     }

    public double saldoDisponivel(){
        return super.saldo;
    }


    @Override
    public void imprimirSaldo() {
        System.out.println("======= SALDO CONTA POUPANÇA =======");
        imprimirInformacoesComuns();
        System.out.println("Saldo Disponível: " + saldoDisponivel() + "\n");

    }



}
