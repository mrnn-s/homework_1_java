//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
/**
 * task_1
 */
import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        System.out.println("Введите число n для вычисления треугольного числа и факториала числа n: ");
        Scanner iScanner = new Scanner(System.in); //cp866 кодировку не пишу ,потому что у меня на маке и так принимал на семинаре почему то кирилицу(хотя тут же только цифры....)
        int n = iScanner.nextInt();
        System.out.print(String.format(" треугольное число ", n));
        System.out.println(triangle(n));
        System.out.print(String.format("Факториал числа ", n));
        System.out.println(factorial(n));
        System.out.println(fact(n));
        
        iScanner.close();
    }

    static int triangle (int n) {
        int result = n*(n+1)/2;
        return result;
    } 

    static int fact (int n) {
        int i = 1;
        int fact = 1;
        while (i <= n){
            fact *= i;
            i += 1;
        }
        return fact;
    }
    
    static int factorial (int n) {
        if(n==1)return 1;
        return n * factorial(n-1);
    }
}