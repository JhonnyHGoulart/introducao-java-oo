package br.com.senai.introducao.modificadordeacesso.classe;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissão;
    private Conta conta;

    public Cliente(String nome, String cpf, String profissão) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissão = profissão;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
