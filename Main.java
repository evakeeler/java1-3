package java1.lesson5;

public class Main {


    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Steve Jobs", "CEO", "steve@mailbox.com", "+123456789", 150000, 40);
        persArray[1] = new Person("Mandy Miles", "Lead Engineer", "mandy@mailbox.com", "+123000789", 100000, 41);
        persArray[2] = new Person("Mike Moore", "QA Engineer", "mike@mailbox.com", "+123001789", 40000, 25);
        persArray[3] = new Person("Stacy Cook", "Product Owner", "stacy@mailbox.com", "+123999789", 120000, 35);
        persArray[4] = new Person("Brad Pitt", "Guest Star", "brad@mailbox.com", "+123777789", 500000, 45);


        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40)
                System.out.println("Older than 40: " + persArray[i].getName());

        }
    }
}












