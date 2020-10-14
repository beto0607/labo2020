package labo.artista;

import labo.instrumento.Guitarra;
import labo.instrumento.InstrumentoMusical;
import labo.notas.NotaEnArreglo;
import labo.notas.frecuencias.FrecuenciasDeLA;

import java.util.List;

public enum Artistas implements IArtista {
    SPINETTA(
            new Guitarra(),
            (intrumento, arreglo) -> arreglo.forEach(
                    (notaEnArreglo) -> intrumento.hacerSonar(notaEnArreglo.getNotas(), notaEnArreglo.getDuracion())
            )
    );

    private InstrumentoMusical instrumentoMusical;
    private ITocarArreglo tocarArreglo;

    Artistas(InstrumentoMusical instrumentoMusical, ITocarArreglo tocarArreglo) {
        this.instrumentoMusical = instrumentoMusical;
        this.tocarArreglo = tocarArreglo;
    }

    @Override
    public void tocarCancion(List<NotaEnArreglo> arreglo) {
        this.tocarArreglo.tocarArreglo(this.instrumentoMusical, arreglo);
    }

    @Override
    public void afinarInstrumento(FrecuenciasDeLA frecuenciasDeLA) {
        this.instrumentoMusical.afinar(frecuenciasDeLA);
    }
}
