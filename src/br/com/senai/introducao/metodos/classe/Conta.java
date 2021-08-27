package br.com.senai.introducao.metodos.classe;

public class Conta {
    public double saldo;
    public int agencia;
    public int numero;
    public String titular;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
