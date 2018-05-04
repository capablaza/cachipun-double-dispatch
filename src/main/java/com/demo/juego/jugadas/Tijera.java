package com.demo.juego.jugadas;

public class Tijera implements Jugada{

    public int jugar(Jugada jugada) {
        return jugada.jugarConTijera(this);
    }

    public int jugarConPiedra(Piedra piedra) {
        return Jugada.PIERDE;
    }

    public int jugarConPapel(Papel papel) {
        return Jugada.GANA;
    }

    public int jugarConTijera(Tijera tijera) {
        return Jugada.EMPATA;
    }
}
