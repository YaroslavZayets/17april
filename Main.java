package Translator;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vocabulary vc =new Vocabulary();
        String text = "";

        try (ObjectInputStream OOR = new ObjectInputStream(new FileInputStream("English.in"))){
        text = (String)OOR.readObject();
        } catch (IOException e){
            System.out.println("Error");
        } catch (ClassNotFoundException e){
            System.out.println("Error");
        }

        text =  text.replaceAll(",", "").replaceAll("\\.", "");
        String[] arr = text.split("\\s+");
        String textTrans = "";

        for (int i = 0; i<arr.length; i++){
            textTrans+=vc.trans(arr[i]).toString()+" ";
        }

        System.out.println(textTrans);

        try (ObjectOutputStream OOS= new ObjectOutputStream(new FileOutputStream("Ukrainian.out"))){
            OOS.writeObject(textTrans);
            System.out.println("Текст записан");

        } catch (IOException e){
            System.out.println("Error");
        }

        vc.add();
//        vc.showVoc();

    }
}
