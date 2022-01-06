package model;

public class Debtor {
    int studentId;
    String nume;
    int grupaStudent;
    int examenId;
    String materie;
    String data;
    int grupaExamen;
    int nota;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGrupaStudent() {
        return grupaStudent;
    }

    public void setGrupaStudent(int grupaStudent) {
        this.grupaStudent = grupaStudent;
    }

    public int getExamenId() {
        return examenId;
    }

    public void setExamenId(int examenId) {
        this.examenId = examenId;
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

    public int getGrupaExamen() {
        return grupaExamen;
    }

    public void setGrupaExamen(int grupaExamen) {
        this.grupaExamen = grupaExamen;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
