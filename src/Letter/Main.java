package Letter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();

        try (BufferedReader f = new BufferedReader(new FileReader("text.txt"))){
            String temp = "";
            while ((temp=f.readLine())!=null){
                text.append(temp);
            }

        } catch (IOException e){
            System.out.println(e);
        }

        Recognizer rec = new Recognizer();
        rec.buildStat(text.toString().toLowerCase());
    }




}
