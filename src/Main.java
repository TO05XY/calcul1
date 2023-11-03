import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Действие: ");
        String  action = scanner.nextLine();
        action = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int res;

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("На ноль не делим.");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Вы где-то ошиблись");

        }
    }
}