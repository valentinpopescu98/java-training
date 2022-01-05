package model;

public class Debtor {
    int student_id;
    String nume;
    int grupa_student;
    int examen_id;
    String materie;
    String data;
    int grupa_examen;
    int nota;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGrupa_student() {
        return grupa_student;
    }

    public void setGrupa_student(int grupa_student) {
        this.grupa_student = grupa_student;
    }

    public int getExamen_id() {
        return examen_id;
    }

    public void setExamen_id(int examen_id) {
        this.examen_id = examen_id;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getGrupa_examen() {
        return grupa_examen;
    }

    public void setGrupa_examen(int grupa_examen) {
        this.grupa_examen = grupa_examen;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
