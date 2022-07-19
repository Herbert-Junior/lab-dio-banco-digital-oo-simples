package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Herbert");

        Conta cc = new Corrente(cli);
        Conta poupanca = new Poupanca(cli);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
