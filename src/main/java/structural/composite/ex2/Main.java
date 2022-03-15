package structural.composite.ex2;

import structural.composite.ex2.menus.Menu;
import structural.composite.ex2.menus.MenuItem;

public class Main {
    public static void main(String[] args) {
        Menu home = new Menu("Home", "/home");

        MenuItem contact = new MenuItem("Contact", "/contact");
        home.add(contact);

        Menu learning = new Menu("Learning", "/learning");
        home.add(learning);

        MenuItem programming = new MenuItem("programming", "/programming");
        learning.add(programming);

        String info = home.toString();
        System.out.println(info);
    }
}
