package structural.facade.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeUrlExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https", "run.mocky.io", "/v3/a37b172b-61f0-4328-b5ac-054d25139b5e");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }
}
