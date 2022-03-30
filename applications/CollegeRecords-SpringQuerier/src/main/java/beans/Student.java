package beans;

public class Student {
    private int student_id;
    private String nume;
    private int grupa;
    private int an_studii;

    public Student(int student_id, String nume, int grupa, int an_studii) {
        this.student_id = student_id;
        this.nume = nume;
        this.grupa = grupa;
        this.an_studii = an_studii;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", nume='" + nume + '\'' +
                ", grupa=" + grupa +
                ", an_studii=" + an_studii +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public int getGrupa() {
        return grupa;
    }
}
