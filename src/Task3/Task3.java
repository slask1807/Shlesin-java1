package Task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Введите элементы массива через Enter");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) System.out.println(i + " элемент массива кратный трем = " + array[i]);
        }
    }
}
