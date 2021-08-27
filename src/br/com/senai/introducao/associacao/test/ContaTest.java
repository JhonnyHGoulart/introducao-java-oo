package br.com.senai.introducao.associacao.test;

import br.com.senai.introducao.associacao.classe.Cliente;
import br.com.senai.introducao.associacao.classe.Conta;

public class ContaTest {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        Conta conta = new Conta();

        paulo.nome = "Paulo Oliveira";
        paulo.cpf = "025.576-63";
        paulo.profissao = "Programador";

        conta.depositar(200);

        conta.titular = paulo;
        System.out.println(conta.titular.nome);
    }
}
