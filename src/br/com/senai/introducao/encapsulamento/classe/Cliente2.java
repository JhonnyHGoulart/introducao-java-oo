package br.com.senai.introducao.encapsulamento.classe;

public class Cliente2 {
    private String nome;
    private String cpf;
    private String profissão;
    private Conta2 conta;

    public Cliente2(String nome, String cpf, String profissão) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissão = profissão;
    }

    public Conta2 getConta() {
        return conta;
    }

    public void setConta(Conta2 conta) {
        this.conta = conta;
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
}
