package br.com.rbrthmn.tarefa13.animais;

public class Preguica extends Animal{
    @Override
    void emitirSom() {
        System.out.println("som de preguica");
    }

    void movimentar() {
        System.out.println("A preguiça sobe em árvores");
    }
}
