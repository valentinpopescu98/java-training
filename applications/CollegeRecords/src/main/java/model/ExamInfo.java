package model;

public class ExamInfo {
    Exam exam;
    ExamStatistics examStatistics;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public ExamStatistics getExamStatistics() {
        return examStatistics;
    }

    public void setExamStatistics(ExamStatistics examStatistics) {
        this.examStatistics = examStatistics;
    }
}
