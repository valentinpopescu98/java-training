package beans;

public class NotaExamen {
    private int examen_id;
    private int student_id;
    private int nota;

    public NotaExamen(int examen_id, int student_id, int nota) {
        this.examen_id = examen_id;
        this.student_id = student_id;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "NotaExamen{" +
                "examen_id=" + examen_id +
                ", student_id=" + student_id +
                ", nota=" + nota +
                '}';
    }

    public int getExamen_id() {
        return examen_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getNota() {
        return nota;
    }
}
