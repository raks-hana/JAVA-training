package Techmm;

public class Customer
{
    private String name;
    private int age;
    private int id;
    Customer(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }
    public void displaydetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

}
