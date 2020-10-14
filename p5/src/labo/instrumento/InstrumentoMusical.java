package labo.instrumento;

import labo.notas.Notas;
import labo.notas.frecuencias.FrecuenciasDeLA;

public interface InstrumentoMusical {
    void hacerSonar();

    void hacerSonar(Notas nota, Integer duracion);

    String queEs();

    void afinar();

    void afinar(FrecuenciasDeLA frecuenciasDeLA);
}
