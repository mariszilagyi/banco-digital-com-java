package com.dio.bootcampcognizantjava.bancodigital;

public class Cliente {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
