package creational.builder.ex1;

public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append("Hello ")
                .append(47)
                .append(' ')
                .append(9.9);

        String string = append.toString();
        System.out.println(string);
    }
}
