package structural.bridge.ex2.printers;

import structural.bridge.ex2.Detail;
import structural.bridge.ex2.formatters.Formatter;

import java.util.List;

public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();
    protected abstract String getHeader();
}
