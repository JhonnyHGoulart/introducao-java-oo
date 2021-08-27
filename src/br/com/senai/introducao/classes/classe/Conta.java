package br.com.senai.introducao.classes.classe;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private String titular;

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

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }
}