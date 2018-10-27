package main;

import java.util.*;
import java.util.PriorityQueue;
import java.util.Random;

class  Man{

    String name;
    int age;
    public  Man(String name, int age)
    {
        this.name = name;
        this.age = age;

    }
    public  Man()
    {
        ;
    }

}


public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list = new ArrayList<>();
        list.add("Text");
        list.add(1, "new");
        for (String s : list)
            System.out.println(s);

        HashSet<Object> listobj = new HashSet<>();
        listobj.add(1);
        listobj.add("text");
        String name = "max";
        int age = 23;
        Man man = new Man(name,age);

        for (Object o : listobj)

            System.out.println(o);
        listobj.remove(1);
        for (Object o : listobj)
        System.out.println(o);

        listobj.add("age: "+ man.age +" name: "+ man.name);
        for (Object o : listobj)

            System.out.println(o);

        Man test = new Man();
        test.name = "Bob";
        test.age = 16;

        list.add(test.name + " | " + test.age);
        for(String str: list)
            System.out.println(str);

        System.out.println("----------------------------------\n New job:");

        Random random = new Random();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        while (true)
        {
            priorityQueue.add(new Integer(random.nextInt(100)));
            Integer in = priorityQueue.poll();
            System.out.println(in);
           break;
        }
        System.out.println("New:");
       List<Integer> numbers = Arrays.asList(1,2,5,87,21,45);
       for (int i=0; i<numbers.size();i++)
       {
           System.out.print(numbers+" "+" - ");
           break;
       }
       numbers.set(2,56);
       for (Integer arg : numbers)
        System.out.print(arg+" ");




        
    }
}
