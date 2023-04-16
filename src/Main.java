// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();//IOS или Android
        task2();//IOS или Android с датой выхода аппарата
        task3();//Високосный год или нет
        task4();//Доставка на дом
        task5();//Месяц в году

    }
    private static void task1() {
        System.out.println("Задача 1");
        int iOs = 0;
        if (iOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    private static void task2() {
        System.out.println("Задача 2");
        int clientDevice = 0;
        int clientDeviceYear = 2016;
        if (clientDevice == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDevice == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDevice == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientDevice == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    private static void task3 () {
        System.out.println("Задача 3");

    }
    private static void task4 () {

    }
    private static void task5 () {

    }
}

