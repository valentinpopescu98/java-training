package demos.ex2;

public class ConsolePrinter {
    void print(TextProvider provider) {
        System.out.println(provider.provide());
    }
}
