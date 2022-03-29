package demos;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<IntegerWrapper> makeList() {
        List<IntegerWrapper> lst = new ArrayList<>();
        for (int i = 0; i < 10; i+=2) {
            IntegerWrapper element = new IntegerWrapper();
            element.setId(i);
            element.setValue(8 - i);
            lst.add(element);
        }

        return lst;
    }
}
