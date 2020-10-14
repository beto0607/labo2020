package labo.notas;

public enum Notas {
    DO("C"),
    RE("D"),
    MI("E"),
    FA("F"),
    SOL("G"),
    LA("A"),
    SI("B");

    private String american;

    Notas(String american){
        this.american = american;
    }

    public String getAmerican() {
        return american;
    }
}
