package com.demo.juego;

import com.demo.juego.jugadas.Jugada;
import com.demo.juego.jugadas.Papel;
import com.demo.juego.jugadas.Piedra;
import com.demo.juego.jugadas.Tijera;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CachipunTest {


    private Papel papel;
    private Piedra piedra;
    private Tijera tijera;

    @Before
    public void before() {
        papel = new Papel();
        piedra = new Piedra();
        tijera = new Tijera();
    }

    @Test
    public void jugadasPapel(){

        assertThat(piedra.jugar(papel), is(Jugada.GANA));
        assertThat(papel.jugar(papel), is(Jugada.EMPATA));
        assertThat(tijera.jugar(papel), is(Jugada.PIERDE));
    }


    @Test
    public void jugadasPiedra(){

        assertThat(piedra.jugar(piedra), is(Jugada.EMPATA));
        assertThat(papel.jugar(piedra), is(Jugada.PIERDE));
        assertThat(tijera.jugar(piedra), is(Jugada.GANA));
    }



    @Test
    public void jugadasTijera(){

        assertThat(piedra.jugar(tijera), is(Jugada.PIERDE));
        assertThat(papel.jugar(tijera), is(Jugada.GANA));
        assertThat(tijera.jugar(tijera), is(Jugada.EMPATA));
    }

}
