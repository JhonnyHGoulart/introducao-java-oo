package br.com.senai.introducao.encapsulamento.classe;

public class Conta2 {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente2 titular;

    public Conta2(double saldo, int agencia, int numero) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public boolean sacar(double saldo) {
        if (this.saldo >= saldo) {
            this.saldo -= saldo;
            System.out.println("Operação realizada com sucesso!");
            return true;
        }
        System.out.println("Falha na operação!");
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Você não pode inserir um valor menor ou igual a zero!");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Você não pode inserir um número menor ou igual a zero!");
            return;
        }
        this.numero = numero;
    }

    public Cliente2 getTitular() {
        return titular;
    }

    public void setTitular(Cliente2 titular) {
        this.titular = titular;
    }
}
