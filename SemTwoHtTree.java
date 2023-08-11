
/* Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений */

import java.util.Scanner;

public class SemTwoHtTree {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            System.out.print("Введите третье число: ");
            int num3 = scanner.nextInt();
            

            int result = check(num1, num2, num3);
            System.out.println("Проверка пройдена успешно!");

        } catch (NumberOutOfRangeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (NumberSumException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (DivisionByZeroException e) {
            System.out.println("Oшибка: " + e.getMessage());
        }
        scanner.close();
    }

    public static int check(int a, int b, int c) 
    throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException
    {
            if (a > 100) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }
            else if(b < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }
            else if((a + b) < 10){
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            else if(c == 0){
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            return 0;
        }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String text) { 
        super(text);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String text) { 
        super(text);
    }
}

class NumberSumException extends Exception {
    public NumberSumException(String text) { 
        super(text);
    }
}
