package structural.bridge.ex2.formatters;

import structural.bridge.ex2.Detail;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
