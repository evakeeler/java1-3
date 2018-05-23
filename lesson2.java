/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, 
метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. 
Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, 
граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), 
при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
*/


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        arrayMinMax();

        int[] arrayCheck = {2, 5, 1, 3, 3};
        System.out.println(checkBalance(arrayCheck));

        stepArray(arrayCheck, 2);
    }


    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[8];
        int counter = -3;
        for (int i = 0; i < arr.length; i++) {
            counter = counter + 3;
            System.out.print(counter + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayMinMax() {
        int[] arr = {1, 5, -10, 100};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[0];
                max = arr[0];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    public static boolean checkBalance(int[] arr) {
        int start = 0;
        int end;
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            start = start + arr[i];
            end = 0;
            if (bool != true) {
                for (int j = arr.length - 1; j > i; j--) {
                    end = end + arr[j];
                }
                if (start == end) {
                    bool = true;
                }
            }
        }
        return bool;
    }

    public static void stepArray(int[] arr, int n) {
        int size = arr.length;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int first = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = first;
            }
        }
        if (n < 0){
            n = n * -1;
            for (int i = size; i > n; i--) {
                int first = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = first;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
