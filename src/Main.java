import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    //Task1
    public static void task1() {
        System.out.println("Введите размер стороны квадрата");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Task2
    public static void task2() {
        System.out.println("Введите размер стороны квадрата");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    //Task3
    public static void task3() {
        System.out.println("Введите длину прямоугольника");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int h = scanner.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 || i == h - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == l - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    //Task4
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    //Task5
    public static void task5() {
        System.out.println("Введите нижнюю границу диапазона");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println("Введите верхнюю границу диапазона");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + " = " + i * j + " ");
            }
            System.out.println("");
        }
    }
}
