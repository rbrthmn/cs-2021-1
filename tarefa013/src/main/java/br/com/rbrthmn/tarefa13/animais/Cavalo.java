package br.com.rbrthmn.tarefa13.animais;

public class Cavalo extends Animal{
    @Override
    void emitirSom() {
        System.out.println("relincha");
    }

    @Override
    void movimentar() {
        System.out.println("O cavalo corre");
    }
}
