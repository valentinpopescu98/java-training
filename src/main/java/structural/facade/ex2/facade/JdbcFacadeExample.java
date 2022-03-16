package structural.facade.ex2.facade;

public class JdbcFacadeExample {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTableTeachers();
        jdbcFacade.insertTeacher("Irina", "Dumitrescu");
    }
}
