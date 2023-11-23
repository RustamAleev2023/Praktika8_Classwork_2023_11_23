import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
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
}
