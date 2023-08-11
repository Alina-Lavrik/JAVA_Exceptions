/* Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю, 
программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
В противном случае, программа должна выводить результат деления.
Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception. 
Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.*/


// Создаем свой класс исключения

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class SemTwoHtTwo {
    
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = sc.nextInt();

            int result = divide(num1, num2);
            System.out.println("Результат деления: " + result);

        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        sc.close();
    }
}