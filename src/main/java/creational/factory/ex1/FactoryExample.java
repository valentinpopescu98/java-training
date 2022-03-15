package creational.factory.ex1;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class FactoryExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
        System.out.println(calendar2);

        Calendar calendar3 = Calendar.getInstance(Locale.ITALIAN);
        System.out.println(calendar3);
    }
}
