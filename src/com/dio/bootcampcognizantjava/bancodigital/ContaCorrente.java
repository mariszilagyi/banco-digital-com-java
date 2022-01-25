package com.dio.bootcampcognizantjava.bancodigital;


public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }


    public ContaCorrente(Cliente cliente) {
        super(cliente);
        chequeEspecial = 0;
    }

    public double saldoDisponivel(){
        return chequeEspecial + super.saldo;
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("======= SALDO CONTA CORRENTE =======");
        imprimirInformacoesComuns();
        System.out.println("Cheque Especial: " + chequeEspecial);
        System.out.println("Saldo Disponível: " + saldoDisponivel() + "\n");

    }

    public void implementarChequeEspecial(double valor){
        chequeEspecial += valor;
    }

    public void cancelarChequeEspecial(){
        chequeEspecial = 0;
    }

}
