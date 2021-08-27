package br.com.senai.introducao.metodos.test;

import br.com.senai.introducao.metodos.classe.Conta2;

public class ContaTest2 {
    public static void main(String[] args) {
        Conta2 contaDaMarcela = new Conta2();
        Conta2 contaDoPaulo = new Conta2();

        contaDaMarcela.depositar(1000);
        contaDaMarcela.transferencia(300, contaDoPaulo);
        System.out.println("Saldo do Paulo " + contaDoPaulo.saldo);
        System.out.println("Saldo da Marcela " + contaDaMarcela.saldo);
    }
}