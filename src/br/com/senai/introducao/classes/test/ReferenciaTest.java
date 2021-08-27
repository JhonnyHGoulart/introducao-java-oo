package br.com.senai.introducao.classes.test;

import br.com.senai.introducao.classes.classe.Conta;

public class ReferenciaTest {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.setSaldo(300);
        Conta segundaConta = primeiraConta;
        segundaConta.setSaldo(segundaConta.getSaldo() + 100);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());

        boolean tipo;
        if (primeiraConta == segundaConta) {
            tipo = true;
        } else {
            tipo = false;
        }
        System.out.println("É a mesma conta? " + tipo);
    }
}