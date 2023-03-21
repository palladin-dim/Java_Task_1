/* задача 1.
Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();

        // Вычисляем n-ое треугольное число
        int triangularNumber = (n * (n + 1)) / 2;

        // Вычисляем n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Треугольное число: " + triangularNumber);
        System.out.println("n! треугольного числа: " + factorial);
    }
}