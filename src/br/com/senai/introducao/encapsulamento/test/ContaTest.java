package br.com.senai.introducao.encapsulamento.test;

import br.com.senai.introducao.encapsulamento.classe.Cliente;
import br.com.senai.introducao.encapsulamento.classe.Conta;

public class ContaTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        cliente.setNome("Jhonny Hilário");
        cliente.setCpf("022.546-83");
        cliente.setProfissao("Programador");

        conta.setTitular(cliente);
        conta.depositar(200);
        System.out.println(conta.sacar(300));
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getSaldo());
    }
}
