package services;

import dao.ExamDao;
import model.ExamInfo;

public class ExamService {
    ExamDao dao;

    public ExamInfo queryExamInfo(int examId) {
        ExamInfo examInfo = new ExamInfo();
        examInfo.setExam(dao.queryExam(examId));
        examInfo.setExamStatistics(dao.queryExamStatistics(examId));
        return examInfo;
    }

    public ExamDao getDao() {
        return dao;
    }

    public void setDao(ExamDao dao) {
        this.dao = dao;
    }
}
