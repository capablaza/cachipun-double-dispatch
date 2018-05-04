package com.demo.juego.jugadas;

public interface Jugada {

    int GANA = 1;
    int PIERDE = -1;
    int EMPATA = 0;

    int jugar(Jugada jugada);

    int jugarConPiedra(Piedra piedra);
    int jugarConPapel(Papel papel);
    int jugarConTijera(Tijera tijera);

}
