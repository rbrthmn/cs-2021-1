package br.com.rbrthmn.tarefa13.animais;

public class Animal {
    private String nome;
    private int idade;

    void emitirSom() {
        System.out.println("O faz algum som");
    }

    void movimentar() {
        System.out.println("O animal faz algum movimento");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
