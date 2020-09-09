package lesson02.task02;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main0202 {
    public static void main(String[] args) throws IOException {

        String inputStr = "";
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("res/text1.txt"), "UTF-8"));
        do {
            i = br.read();
            if (i != -1) inputStr += ((char) i);
        } while (i != -1);

       
    }
}
