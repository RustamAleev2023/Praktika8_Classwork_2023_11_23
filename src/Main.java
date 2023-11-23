import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
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
    public static void task2(){
        System.out.println("Введите размер стороны квадрата");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == n-1){
                    System.out.print("*");
                } else {
                    if(j == 0 || j == n - 1){
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
    public static void task3(){
        System.out.println("Введите длину прямоугольника");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int h = scanner.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if(i == 0 || i == h-1){
                    System.out.print("*");
                } else {
                    if(j == 0 || j == l - 1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
