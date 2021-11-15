package br.com.rbrthmn.tarefa13.animais;

public class Veterinario {

    public static void main(String[] args) {
        var cachorro = new Cachorro();
        var cavalo = new Cavalo();
        var preguica = new Preguica();

        examinar(cachorro);
        examinar(cavalo);
        examinar(preguica);
    }

    public static void examinar(Animal animal) {
        animal.emitirSom();
    }
}
