import java.util.Scanner;

public class Main {
    public static void determineTheYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год - ");
        int year = scanner.nextInt();
        determineTheYear(year);

    }

    public static void task2() {
        System.out.println("Задача 2");
    }

    public static void task3() {
        System.out.println("Задача 3");

    }
}