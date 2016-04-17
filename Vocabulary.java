package Translator;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Vocabulary {
    Map<String , String> voc = new HashMap<>();

    public String trans (String word){

        try (BufferedReader br = new BufferedReader(new FileReader("Vocabulary.vcb"))){
            String tmp = "";
            while ((tmp = br.readLine())!=null){
            String[] stmp = tmp.split("\\s");
            voc.put(stmp[0],stmp[1]);
            }

        } catch (IOException e){
            System.out.println(e);
        }

        return voc.get(word);
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово на английском - ");
        String eng = sc.nextLine();
        System.out.println("Введите перевод - ");
        String rus = sc.nextLine();
        voc.put(eng,rus);

        try (PrintWriter f = new PrintWriter("Vocabulary.vcb")){
            Set<Map.Entry<String,String>> hms = voc.entrySet();

            for (Map.Entry<String,String> hmse:hms){
                f.println(hmse.getKey() + " " + hmse.getValue());
            }

        } catch (FileNotFoundException e){
            System.out.println("Error");
        }

    }

    public void showVoc (){
        Iterator<Map.Entry<String,String>> itr = voc.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
