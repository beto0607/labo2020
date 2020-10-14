package labo.notas.frecuencias;

public enum FrecuenciasDeLA {
    La440Hz("ISO 16"),
    La444hz("Afinación de cámara"),
    La446Hz("Renacimiento"),
    La480Hz("Órganos de Bach");

    private String descripcion;

    FrecuenciasDeLA(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
