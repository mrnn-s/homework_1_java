//Вывести все простые числа от 1 до 1000
public class task_2 {
     public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) { //квадратный корень индекса
                if (i % j == 0) {
                    break;
                }
            }
                System.out.println(i);
            }
        }
    }


