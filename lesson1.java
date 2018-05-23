/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), 
если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, 
метод должен напечатать в консоль положительное ли число передали, или отрицательное; 
Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, 
метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. 
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/




public class Main {

    public static void main(String[] args) {
	// write your code here
        byte bt = 100;
        short sh = 2352;
        int i = 25;
        long ln = 3000L;
        float fl = 3.0f;
        double db = 20.5;
        boolean bool = true;
        char ch = 'A';

    System.out.println (Example (2,3,4,5));

    System.out.println (Sum (2,10));

    Number(10);

    System.out.println (Number2 (-200));

    PrintName("Марина");

    Year (1989);
    }

    public static double Example (int a, int b, int c, int d) {
        double exmpl = a * (b + (c / d));

        return exmpl;
    }

    public static  boolean Sum (int a, int b) {
        boolean bool;
        if ((a+b)>10 && (a+b) <=20) {
            bool = true;
        } else bool = false;
            return bool;
    }

    public static void Number (int a) {
        if (a>=0) {
            System.out.println ("Положительное число");
        } else System.out.println ("Отрицательное число");
    }

    public static boolean Number2 (int a) {
        boolean bool;
        if (a<0) {
            bool = true;
        } else bool = false;
            return bool;
    }

    public static void PrintName (String s) {
        System.out.println ("Привет, " + s + "!");
    }

    public static void Year (int a) {
        if (a%4==0 || a%400==0) {
        System.out.println (a + " - високосный год.");
        } else if (a%4==1 || a%400==1 || a%100==0) {
            System.out.println (a+ " - невисокосный год.");
        }

    }

}
