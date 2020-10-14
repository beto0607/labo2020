package labo.instrumento;

import labo.notas.Notas;
import labo.notas.frecuencias.FrecuenciasDeLA;

public class InstrumentoDeCuerda implements InstrumentoMusical {
    @Override
    public void hacerSonar() {
        System.out.println("Sonar Cuerdas");
    }

    @Override
    public void hacerSonar(Notas nota, Integer duracion) {

    }

    @Override
    public String queEs() {
        return "Instrumento de Cuerda";
    }

    @Override
    public void afinar() {

    }

    @Override
    public void afinar(FrecuenciasDeLA frecuenciasDeLA) {

    }
}
