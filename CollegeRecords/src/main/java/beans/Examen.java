package beans;

public class Examen {
    private int examen_id;
    private int grupa;
    private String materie;
    private String nume_profesor;
    private String data;
    private int sala;

    public Examen(int examen_id, int grupa, String materie, String nume_profesor, String data, int sala) {
        this.examen_id = examen_id;
        this.grupa = grupa;
        this.materie = materie;
        this.nume_profesor = nume_profesor;
        this.data = data;
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "examen_id=" + examen_id +
                ", grupa=" + grupa +
                ", materie='" + materie + '\'' +
                ", nume_profesor='" + nume_profesor + '\'' +
                ", data='" + data + '\'' +
                ", sala=" + sala +
                '}';
    }

    public String getMaterie() {
        return materie;
    }

    public String getData() {
        return data;
    }
}
