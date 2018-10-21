package project;

import java.util.*;
interface ShowInfo{
    void Show();
}

abstract class Person implements ShowInfo{

    private  String name;

    public String getName(){

        return name;
    }

    public  Person(String name)
    {
        this.name = name;

    }
    public abstract void Show();

}

class Employee extends Person{
    private String bank;
    public Employee(String name, String company)
    {
        super(name);
        this.bank = company;

    }

    public  void Show(){
        System.out.printf("Employee Name: %s \t Bank: %s \n",super.getName(),bank);

    }

}

class  Client extends Person{

    private String bank;

    public Client(String name, String company){
        super(name);
        this.bank = company;

    }

    public void Show(){
        System.out.printf("Client Name: %s \t Bank: %s \n",super.getName(), bank);

    }
}
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client jack = new Client("Jack", "National City");
        jack.Show();
        Employee bob = new Employee("Bob", "National Bank");
        bob.Show();

    }
}