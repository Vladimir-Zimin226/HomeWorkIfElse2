public class Main {
    public static void main(String[] args) {
        //Task 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ошибка входных данных");
        }

        //Task 2
        int clientOs2 = 1;
        int clientDeviceYear = 2014;
        if (clientOs2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка входных данных");
        }

        //Task 3
        int year = 2024;
        boolean leapYear = (year >= 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //Task 4
        //Variant 1
        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет двое суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Доставки нет");
        }

        //Variant 2
        int deliveryDistance1 = 101;
        int deliveryTime;
        if (deliveryDistance1 > 0 && deliveryDistance1 <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance1 > 20 && deliveryDistance1 <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance1 > 60 && deliveryDistance1 <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

        //Task 5
        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Этот месяц идет зимой");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц идет весной");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц идет летом");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц идет осенью");
                break;
            case 12:
                System.out.println("Этот месяц идет зимой");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}