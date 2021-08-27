package br.com.senai.introducao.metodos.test;

import br.com.senai.introducao.metodos.classe.Conta;

public class ContaTest {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 50;
        contaDoPaulo.depositar(200);
        System.out.println("Saldo atual " + contaDoPaulo.saldo);
        boolean sacou = contaDoPaulo.sacar(100);
        System.out.println("Saque");
        System.out.println("Conseguiu sacar? " + sacou);
        System.out.println("Saldo atual " + contaDoPaulo.saldo);
    }
}
