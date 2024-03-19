import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task1");
        int year = 2024;
        if (checkLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println();
    }

    public static boolean checkLeapYear(int year) {
        boolean result = false;
        if (year >= 1584) {
            result = (year % 400 == 0 && year % 100 != 0) || year % 4 == 0;
        }
        return result;
    }

    public static void task2() {
        System.out.println("Task2");
        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        System.out.println(printAppVersion(clientOS, currentYear));
        System.out.println();
    }

    public static String printAppVersion(int clientOS, int clientDeviceYear) {
        String result;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            result = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 0) {
            result = "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            result = "Установите облегченную версию приложения для Android по ссылке";
        } else {
            result = "Установите версию приложения для Android по ссылке";
        }
        return result;
    }

    public static void task3() {
        System.out.println("Task3");
        int deliveryDistance = 95;
        int deliveryDays = getDeliveryDays(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static int getDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 1 + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = 1 + 1 + 1;
        }
        return deliveryDays;
    }
}