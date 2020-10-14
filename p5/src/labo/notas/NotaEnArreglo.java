package labo.notas;

import labo.notas.Notas;

public class NotaEnArreglo {
    private Notas notas;
    private Integer duracion;

    public NotaEnArreglo(Notas notas, Integer duracion) {
        this.notas = notas;
        this.duracion = duracion;
    }

    public Notas getNotas() {
        return notas;
    }

    public Integer getDuracion() {
        return duracion;
    }
}
