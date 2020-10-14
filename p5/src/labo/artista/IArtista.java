package labo.artista;

import labo.notas.NotaEnArreglo;
import labo.notas.frecuencias.FrecuenciasDeLA;

import java.util.List;

public interface IArtista {
    void tocarCancion(List<NotaEnArreglo> arreglo);

    void afinarInstrumento(FrecuenciasDeLA frecuenciasDeLA);
}
