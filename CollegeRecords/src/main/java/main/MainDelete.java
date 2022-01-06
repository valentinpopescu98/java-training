package main;

import dao.StudentDao;

public class MainDelete {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        studentDao.deleteRow(17);

        studentDao.killConnection();
    }
}
