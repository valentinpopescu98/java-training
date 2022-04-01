package demos.ex13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/demos/ex12/text.txt");
        Charset charset = Charset.defaultCharset();

        long linesCount = Files.lines(path, charset)
                .count();

        System.out.println(linesCount);
    }
}
