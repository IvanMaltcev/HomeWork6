public class Main {
    public static void main(String[] args) {

        // Задача 1

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 2

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        // Задача 3

        for (int k = 0; k < 17; k = k + 2) {
            System.out.print(k + " ");
        }
        System.out.println("\n");

        // Задача 4

        for (int l = 10; l >= -10; l--) {
            System.out.print(l + " ");
        }
        System.out.println("\n");

        // Задача 5

        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.print("\n");

        // Задача 6

        for (int x = 7; x <= 98; x = x + 7) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        // Задача 7

        for (int y = 1; y <= 512; y = y * 2) {
            System.out.print(y + " ");
        }
        System.out.println("\n");

        // Задача 8

        int sum = 29000;
        int total = 0;

        for (int z = 1; z <= 12; z++) {
            total = total + sum;
            System.out.println("Месяц " + z + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.print("\n");

        // Задача 9

        int deposit = 29000;
        int totalSum = 0;
        for (int f = 1; f <= 12; f++) {
            totalSum = totalSum + (totalSum / 100) + deposit;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + totalSum + " рублей.");
        }
        System.out.print("\n");

        // Задача 10

        int number = 2;

        for (int n = 1; n <= 10; n++) {
            System.out.println(number + "*" + n + "=" + (number * n));
        }
    }
}