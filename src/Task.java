import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numberUser = input.nextInt();
        if(numberUser > 7) {
            System.out.println("Привет");
        }
        input.close();
    }
}