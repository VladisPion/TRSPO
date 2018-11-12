package test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        obj.put("name",name);
        int age = 18+random.nextInt(100-18);
        System.out.println("Generating age: "+age);
        obj.put("age",age);

        JSONArray list = new JSONArray();
        list.add("msg1");
        list.add("msg2");
        list.add("msg3");
        obj.put("messages",list);
        try (FileWriter file = new FileWriter("src\\test\\test.json")) {

            file.write(obj.toJSONString());
            file.flush();
        }  catch (IOException ex){
            ex.printStackTrace();

        }
        System.out.println(obj);
    }
}

