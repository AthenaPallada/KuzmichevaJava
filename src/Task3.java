import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Задайте размер массива - ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните числами массив через пробел: ");
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Вывести элементы массива кратные 3: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0 && array[i] !=0) {
                System.out.println(array[i]);
            }
        }
        input.close();
    }
}