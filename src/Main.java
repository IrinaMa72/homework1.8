public class Main {
//    Задание 1
    public static void checksLeapYear(int yearLeap) {
        if (yearLeap % 4 == 0 && yearLeap % 100 != 0 || yearLeap % 400 == 0) {
            System.out.println(yearLeap + " год является високосным!");}
        else {
        System.out.println(yearLeap + " год не является високосным!");}
    }
//    Задание 2
    public static int getClientOS(String OS, int currentYear) {
        if (OS.equals("iOS")) {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS");
            }
        } else if (OS.equals("Android")) {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        return currentYear;
    }
//    Задание 3
    public static int deliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);}
        if (deliveryDistance > 100) {
            System.out.println("Доставка невозможна");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//    Задание 1
        int year = 2021;
        checksLeapYear(year);

//    Задание 2
        String OS = "iOS";
        int currentYear = 2015;
        int clientOS = getClientOS(OS, currentYear);
//    Задание 3
        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);

    }
}