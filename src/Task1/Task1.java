package Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
