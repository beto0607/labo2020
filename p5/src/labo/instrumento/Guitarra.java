package labo.instrumento;

import labo.notas.Notas;
import labo.notas.frecuencias.FrecuenciasDeLA;

import static java.lang.System.out;

public class Guitarra implements InstrumentoMusical {
    @Override
    public void hacerSonar() {
        out.println("Guitarra sonando aleatoriamente");
    }

    @Override
    public void hacerSonar(Notas nota, Integer duracion) {
        out.println(String.format("Guitarra sonando en %s(%s) por %d segundos", nota, nota.getAmerican(), duracion));
    }

    @Override
    public String queEs() {
        return "Piano";
    }

    @Override
    public void afinar() {
        out.println("Afinando guitarra...");
    }

    @Override
    public void afinar(FrecuenciasDeLA frecuenciasDeLA) {
        out.println(String.format("Afinando guitarra en %s(%s) ", frecuenciasDeLA, frecuenciasDeLA.getDescripcion()));
    }
}
