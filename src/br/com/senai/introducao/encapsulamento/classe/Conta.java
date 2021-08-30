package br.com.senai.introducao.encapsulamento.classe;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void depositar(double valor) {
        this.saldo = valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Aprovado!");
            return true;
        }
        System.out.println("Falha na operação");
        return false;
    }
}
