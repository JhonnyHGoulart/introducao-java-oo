package br.com.senai.introducao.classes.test;

import br.com.senai.introducao.classes.classe.Conta;

public class ContaTest2 {
    public static void main(String[] args) {
        Conta conta2 = new Conta();

        System.out.println(conta2.getSaldo());
        System.out.println(conta2.getAgencia());
        System.out.println(conta2.getNumero());
        System.out.println(conta2.getTitular());
    }
}