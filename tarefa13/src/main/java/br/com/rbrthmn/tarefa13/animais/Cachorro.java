package br.com.rbrthmn.tarefa13.animais;

public class Cachorro extends Animal{

    @Override
    void emitirSom() {
        System.out.println("latido");
    }

    @Override
    void movimentar() {
        System.out.println("O cachorro deve correr");
    }
}
