package com.demo.juego.jugadas;

public class Piedra implements Jugada{

    public int jugar(Jugada jugada) {
        return jugada.jugarConPiedra(this);
    }

    public int jugarConPiedra(Piedra piedra) {
        return Jugada.EMPATA;
    }

    public int jugarConPapel(Papel papel) {
        return Jugada.PIERDE;
    }

    public int jugarConTijera(Tijera tijera) {
        return Jugada.GANA;
    }
}
