package br.com.senai.introducao.modificadordeacesso.test;

import br.com.senai.introducao.modificadordeacesso.classe.Cliente;
import br.com.senai.introducao.modificadordeacesso.classe.Conta;

public class CleinteTest {
    public static void main(String[] args) {
        Conta conta = new Conta(3000, 025, 123456);
        Conta segundaConta = new Conta(2000, 035, 7894556 - 2);
        Cliente cliente = new Cliente("Jhonny", "132564-9", "Programadro");

        conta.setTitular(cliente);
        cliente.setConta(conta);
    }
}
