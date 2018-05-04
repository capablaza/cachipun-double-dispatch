package com.demo.juego.jugadas;

public class Papel implements Jugada{

    public int jugar(Jugada jugada) {
        return jugada.jugarConPapel(this);
    }

    public int jugarConPiedra(Piedra piedra) {
        return Jugada.GANA;
    }

    public int jugarConPapel(Papel papel) {
        return Jugada.EMPATA;
    }

    public int jugarConTijera(Tijera tijera) {
        return Jugada.PIERDE;
    }
}
