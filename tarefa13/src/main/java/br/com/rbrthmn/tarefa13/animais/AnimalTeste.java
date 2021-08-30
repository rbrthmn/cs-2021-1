package br.com.rbrthmn.tarefa13.animais;

public class AnimalTeste {
    public static void main(String[] args) {
        var cachorro = new Cachorro();
        var cavalo = new Cavalo();
        var preguica = new Preguica();

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
    }
}
