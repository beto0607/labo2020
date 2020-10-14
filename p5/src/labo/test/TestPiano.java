package labo.test;

import labo.instrumento.Piano;
import labo.notas.Notas;
import labo.notas.frecuencias.FrecuenciasDeLA;

public class TestPiano {

    public static void main(String[] args) {
        Piano piano = new Piano();

        piano.afinar(FrecuenciasDeLA.La440Hz);
        piano.afinar(FrecuenciasDeLA.La480Hz);

        piano.hacerSonar(Notas.MI, 3);
        piano.hacerSonar(Notas.SOL, 5);
    }
}
