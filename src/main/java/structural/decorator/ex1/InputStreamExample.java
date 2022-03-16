package structural.decorator.ex1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/resources/output.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeChars("Hello Design Patterns!");
    }
}
