import beans.Examen;
import beans.NotaExamen;
import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.Arrays;

public class Main {
    private static String getStudenti(List<Student> studenti) {
        String output = "";

        for (Student student : studenti) {
            output += student + "\n";
        }

        return output;
    }

    private static String getExamene(List<Examen> examene) {
        String output = "";

        for (Examen examen : examene) {
            output += examen + "\n";
        }

        return output;
    }

    private static String getNoteExamene(List<NotaExamen> noteExamene) {
        String output = "";

        for (NotaExamen notaExamen : noteExamene) {
            output += notaExamen + "\n";
        }

        return output;
    }

    private static String getDebtors(List<Student> studenti, List<Examen> examene, List<NotaExamen> noteExamene) {
        String output = "";

        for (NotaExamen notaExamen : noteExamene) {
            if (notaExamen.getNota() < 5) {
                int studentID = notaExamen.getStudent_id();
                Student crtStudent = studenti.get(studentID - 1);

                int examenID = notaExamen.getExamen_id();
                Examen crtExamen = examene.get(examenID - 1);

                String nota = notaExamen.getNota() == 0 ? "NULL" : Integer.toString(notaExamen.getNota());

                output += studentID + " " + crtStudent.getNume() + " " + crtStudent.getGrupa() +
                        " " + examenID + " " + crtExamen.getMaterie() + " " + crtExamen.getData() + " " + crtExamen.getGrupa() +
                        " " + nota + "\n";
            }
        }

        return output;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);
        Student student3 = context.getBean("student3", Student.class);
        Student student4 = context.getBean("student4", Student.class);
        List<Student> studenti = Arrays.asList(student1, student2, student3, student4);

        Examen examen1 = context.getBean("examen1", Examen.class);
        Examen examen2 = context.getBean("examen2", Examen.class);
        Examen examen3 = context.getBean("examen3", Examen.class);
        Examen examen4 = context.getBean("examen4", Examen.class);
        Examen examen5 = context.getBean("examen5", Examen.class);
        Examen examen6 = context.getBean("examen6", Examen.class);
        Examen examen7 = context.getBean("examen7", Examen.class);
        Examen examen8 = context.getBean("examen8", Examen.class);
        List<Examen> examene = Arrays.asList(examen1, examen2, examen3, examen4,
                                            examen5, examen6, examen7, examen8);

        NotaExamen notaExamen1 = context.getBean("nota_examen1", NotaExamen.class);
        NotaExamen notaExamen2 = context.getBean("nota_examen2", NotaExamen.class);
        NotaExamen notaExamen3 = context.getBean("nota_examen3", NotaExamen.class);
        NotaExamen notaExamen4 = context.getBean("nota_examen4", NotaExamen.class);
        NotaExamen notaExamen5 = context.getBean("nota_examen5", NotaExamen.class);
        NotaExamen notaExamen6 = context.getBean("nota_examen6", NotaExamen.class);
        NotaExamen notaExamen7 = context.getBean("nota_examen7", NotaExamen.class);
        NotaExamen notaExamen8 = context.getBean("nota_examen8", NotaExamen.class);
        List<NotaExamen> noteExamene = Arrays.asList(notaExamen1, notaExamen2, notaExamen3, notaExamen4,
                                                    notaExamen5, notaExamen6, notaExamen7, notaExamen8);

        System.out.println("All students:");
        System.out.println(getStudenti(studenti));
        System.out.println(getExamene(examene));
        System.out.println(getNoteExamene(noteExamene));

        System.out.println("Debtors:");
        System.out.println(getDebtors(studenti, examene, noteExamene));
    }
}
