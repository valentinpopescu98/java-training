package primary.exam;

import dao.ExamDao;
import model.ExamInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.ExamService;

public class MainQueryInfo {
    static void print(ExamInfo info) {
        System.out.print(info.getExam().getExamId() + " ");
        System.out.print(info.getExam().getStudyGroup() + " ");
        System.out.print(info.getExam().getSubject() + " ");
        System.out.print(info.getExam().getProfessorName() + " ");
        System.out.print(info.getExam().getDate() + " ");
        System.out.print(info.getExam().getClassroom() + " ");
        System.out.print(info.getExamStatistics().getStudentsAttending() + " ");
        System.out.print(info.getExamStatistics().getStudentsPromoted() + " ");
        System.out.print(info.getExamStatistics().getAverageGrade() + "\n");
        System.out.println();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        ExamDao dao = context.getBean(ExamDao.class);
        ExamService dao = context.getBean(ExamService.class);

        ExamInfo result = dao.queryExamInfo(1);
        print(result);

        dao.getDao().killConnection();
    }
}
