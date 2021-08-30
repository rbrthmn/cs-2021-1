package br.com.rbrthmn.tarefa13.animais;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> jaulas;

    public Zoologico() {
        var cachorro = new Cachorro();
        var cavalo = new Cavalo();
        var preguica = new Preguica();
        var cachorro2 = new Cachorro();
        var cavalo2 = new Cavalo();
        var preguica2 = new Preguica();
        var cachorro3 = new Cachorro();
        var cavalo3 = new Cavalo();
        var preguica3 = new Preguica();
        var preguica4 = new Preguica();
        this.jaulas = new ArrayList<>();

        this.jaulas.add(cachorro);
        this.jaulas.add(cavalo);
        this.jaulas.add(preguica);
        this.jaulas.add(cachorro2);
        this.jaulas.add(cavalo2);
        this.jaulas.add(preguica2);
        this.jaulas.add(cachorro3);
        this.jaulas.add(cavalo3);
        this.jaulas.add(preguica3);
        this.jaulas.add(preguica4);
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal.getClass().equals(Cachorro.class) || animal.getClass().equals(Cavalo.class))
                animal.movimentar();
        }
    }

    public List<Animal> getJaulas() {
        return jaulas;
    }

    public void setJaulas(List<Animal> jaulas) {
        this.jaulas = jaulas;
    }
}
