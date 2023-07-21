import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void determineTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void determineTypeOS(int year1, int typeOS) {
        if (year1 > LocalDate.now().getYear() || typeOS != 0 && typeOS != 1) {
            System.out.println("Ваша ОС не поддерживается");
        } else {
            System.out.println("Установите " + (year1 > 2015 ? "полную " : "облегченную ") + "версию приложения для "
                    + (typeOS == 0 ? "iOS" : "Android") + " по ссылке");
        }
    }

    public static void determineTheDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
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
        Scanner scanner1 = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);
        System.out.println("Введите тип ОС, где 0 - iOS, 1 - Android - ");
        int typeOS = scanner1.nextInt();
        determineTypeOS(currentYear, typeOS);
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите расстояние до адреса доставки, расстояние в км - ");
        int distance = scanner2.nextInt();
        determineTheDeliveryDays(distance);
    }
}