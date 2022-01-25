package com.dio.bootcampcognizantjava.bancodigital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Conta implements InterfaceConta{

    protected static final String AGENCIA_PADRAO = "0001";
    protected static Integer SEQUENCIAL = 0;

    protected String agencia;
    protected String numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL + "-" + calcularDigito();
        this.saldo =0;
        this.cliente = cliente;
    }


    public String getAgencia() {
        return agencia;
    }

    public Integer calcularDigito() {

        String sequencial = Integer.toString(SEQUENCIAL);
        List<Integer> sequencialList = new ArrayList<>();

        for(int i = 0; i < sequencial.length(); i++){
            String numeral = sequencial.substring(i, i+1);
            sequencialList.add(Integer.parseInt(numeral));
        }

        List<Integer> multipSequencial = new ArrayList<>();

        int x = 9;

        for (Integer posicaoI : sequencialList) {
            multipSequencial.add(posicaoI * x);
            x--;
        }
        Iterator<Integer> iterator = multipSequencial.iterator();

        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();

        }


        return (soma / 11)+1;


    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);

    }

    protected void imprimirInformacoesComuns() {
        System.out.print("Agência: " + this.agencia);
        System.out.println("     -     Conta: " + this.numero);
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Saldo: " + this.getSaldo());

    }


}
