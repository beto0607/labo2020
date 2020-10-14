package labo.artista;

import labo.instrumento.InstrumentoMusical;
import labo.notas.NotaEnArreglo;

import java.util.List;

public interface ITocarArreglo {
    void tocarArreglo(InstrumentoMusical intrumento, List<NotaEnArreglo> arreglo);
}
