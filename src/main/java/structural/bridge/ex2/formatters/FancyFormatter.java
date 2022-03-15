package structural.bridge.ex2.formatters;

import structural.bridge.ex2.Detail;

import java.util.List;

public class FancyFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append(header);
        builder.append("\n*************\n");

        for (Detail detail : details) {
            builder.append(detail.getLabel());
            builder.append(": ");
            builder.append(detail.getValue());
            builder.append("\n*************\n");
        }

        return builder.toString();
    }
}
