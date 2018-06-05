package java1.lesson5;

public class Person {

    private String name;
    private String occupation;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Person(String name, String occupation, String email, String phone, int salary, int age) {
        this.name = name;
        this.occupation = occupation;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        System.out.println("Name: " + this.name + " Occupation: " + this.occupation + " Email: " + this.email + " Phone: " + this.phone + " Salary: " + this.salary + " Age: " + this.age);


    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}