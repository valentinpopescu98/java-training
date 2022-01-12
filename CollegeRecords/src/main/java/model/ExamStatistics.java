package model;

public class ExamStatistics {
    Exam exam;
    int studentsAttending;
    int studentsPromoted;
    float averageGrade;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public int getStudentsAttending() {
        return studentsAttending;
    }

    public void setStudentsAttending(int studentsAttending) {
        this.studentsAttending = studentsAttending;
    }

    public int getStudentsPromoted() {
        return studentsPromoted;
    }

    public void setStudentsPromoted(int studentsPromoted) {
        this.studentsPromoted = studentsPromoted;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }
}
