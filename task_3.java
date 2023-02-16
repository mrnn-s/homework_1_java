//Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
//DOUBLE на всякий случай и проверочку на ноль
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble(); 
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = scanner.next(); //оператор
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        // Выполннение операции
        double result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка ,делить на ноль нельзя");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка,попробуй еще раз и можжет пример полегче?");
                return;
        }

        // Вывести результат
        System.out.println("Результат: " + result);
    }
}
