package com.dio.bootcampcognizantjava.bancodigital;

public class Teste {

    public static void main(String[] args) {

        Cliente mariana = new Cliente("Mariana Szilagyi Santos", "000.000.000-00");

        ContaCorrente cc1 = new ContaCorrente(mariana);
        cc1.calcularDigito();
        System.out.println(cc1.getAgencia());
        System.out.println(cc1.getNumero());
        cc1.depositar(100);
        System.out.println(cc1.saldo);
        cc1.sacar(35.50);
        System.out.println(cc1.saldo);
        cc1.imprimirSaldo();
        cc1.implementarChequeEspecial(1000);
        System.out.println(cc1.getChequeEspecial());
        cc1.imprimirSaldo();
        cc1.cancelarChequeEspecial();
        cc1.imprimirSaldo();





        Conta cp1 = new ContaPoupanca(mariana);
        cp1.depositar(1000);
        cp1.sacar(250.00);
        cp1.imprimirSaldo();
        cp1.transferir(300.00,cc1);



    }
}
