package com.company;

/*
1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. 
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. 
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", 
"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", 
"pineapple", "pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. 
Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока 
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
*/

import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("Привет! Хочешь поиграть? Угадай число от 0 до 9, но помни - у тебя всего 3 попытки. Удачи!");
        guessNumber();
    }

        
    public static void guessNumber() {
            Scanner sc = new Scanner(System.in);
            int answer = 0;
            int enter;
            int number;
            Random random = new Random();
            number = random.nextInt(10);
            do {
                System.out.println("Введи целое число: ");
                if (sc.hasNextInt()) {
                    enter = sc.nextInt();
                    answer = answer + 1;
                    if (enter > number) {
                        System.out.println("Введенное число слишком большое.");
                    } else if (enter < number) {
                        System.out.println("Введенное число слишком маленькое.");
                    } else if (enter == number) {
                        System.out.println("Поздравляю, ты угадал число!");
                        System.out.println("Повторить игру еще раз?");
                        System.out.println("1 – да / 0 – нет");
                        endGame();

                    }
                } else {
                    System.out.println("Нужно ввести целое число!");
                }

            } while (answer < 3);
            System.out.println("Ты проиграл :(");
            System.out.println("Повторить игру еще раз?");
            System.out.println("1 – да / 0 – нет");
            endGame();

        }

        
    public static void endGame () {
            Scanner sc = new Scanner(System.in);
            int enter;
            if (sc.hasNextInt()) {
                enter = sc.nextInt();
                if (enter == 1) {
                    guessNumber();
                } else if (enter == 0) {
                    System.out.println("Конец игры. Хорошего тебе дня! :)");
                    System.exit(0);

                }
            } else {
                System.out.println("Нужно ввести целое число!");
                }
        }
    }
