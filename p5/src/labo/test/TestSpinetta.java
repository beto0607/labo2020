package labo.test;

import labo.artista.Artistas;
import labo.notas.NotaEnArreglo;
import labo.notas.Notas;
import labo.notas.frecuencias.FrecuenciasDeLA;

import java.util.ArrayList;
import java.util.List;

public class TestSpinetta {

    public static void main(String[] args) {
        Artistas spinetta = Artistas.SPINETTA;

        List<NotaEnArreglo> notas = new ArrayList<NotaEnArreglo>();
        notas.add(new NotaEnArreglo(Notas.MI, 3));
        notas.add(new NotaEnArreglo(Notas.DO, 4));
        notas.add(new NotaEnArreglo(Notas.SOL, 2));
        notas.add(new NotaEnArreglo(Notas.DO, 6));

        spinetta.afinarInstrumento(FrecuenciasDeLA.La444hz);

        spinetta.tocarCancion(notas);
    }
}
