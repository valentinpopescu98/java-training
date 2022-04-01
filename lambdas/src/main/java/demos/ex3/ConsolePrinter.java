package demos.ex3;

import org.jetbrains.annotations.NotNull;

public class ConsolePrinter {
    void print(@NotNull DataProvider provider, int a, int b) {
        System.out.println(provider.sum(a, b));
    }
}
