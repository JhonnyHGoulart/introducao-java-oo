package br.com.senai.introducao.metodos.classe;

public class Conta2 {
    public double saldo;
    public int agencia;
    public int numero;
    public int titular;

    public void depositar(double valor) {
        this.saldo = valor;
    }

    public boolean transferencia(double valor, Conta2 destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Tranferência feita com sucesso!");
            return true;

        }
        System.out.println("Transferência falhou!");
        return false;
    }
}