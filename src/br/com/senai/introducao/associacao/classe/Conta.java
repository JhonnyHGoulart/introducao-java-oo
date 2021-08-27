package br.com.senai.introducao.associacao.classe;

public class Conta {
    public double saldo;
    public int agencia;
    public int numero;
    public Cliente titular;

    public void depositar(double valor) {
        this.saldo = valor;
    }
}
