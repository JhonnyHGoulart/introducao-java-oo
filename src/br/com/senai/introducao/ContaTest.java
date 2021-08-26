package br.com.senai.introducao;

public class ContaTest {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(200);
        System.out.println(conta.getSaldo());
    }
}