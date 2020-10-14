package labo.instrumento;

import labo.notas.Notas;
import labo.notas.frecuencias.FrecuenciasDeLA;

public class InstrumentoDeViento implements InstrumentoMusical {


    public void hacerSonar() {
        System.out.println("Sonar Vientos");
    }

    @Override
    public void hacerSonar(Notas nota, Integer duracion) {

    }

    public String queEs() {
        return "Instrumento de Viento";
    }

    public void afinar() {

    }

    @Override
    public void afinar(FrecuenciasDeLA frecuenciasDeLA) {

    }
}
