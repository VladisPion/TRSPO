package main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Threads threads = new Threads();
        Thread   thread = new Thread(new Threads());
        Scanner in = new Scanner(System.in);

        thread.start();
        String stop = in.next();
        if (stop.equals("s")){
            thread.stop();
            System.out.println("Thread is stopped");
        }

    }
}

