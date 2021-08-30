package br.com.senai.introducao.encapsulamento.test;

import br.com.senai.introducao.encapsulamento.classe.Cliente2;
import br.com.senai.introducao.encapsulamento.classe.Conta2;

public class ContaTest2 {
    public static void main(String[] args) {
        Conta2 conta = new Conta2(2000, 025, 0023654);
        Cliente2 cliente = new Cliente2("Jhonny Hilário", "025-767-9", "Programador");

        conta.setAgencia(-55);
        conta.setNumero(0);

        conta.setTitular(cliente);
        cliente.setConta(conta);

        conta.setSaldo(3000);
        conta.sacar(200);
        System.out.println(cliente.getConta().getSaldo());
    }
}
