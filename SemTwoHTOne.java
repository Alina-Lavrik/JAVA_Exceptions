
/*Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
В противном случае, программа должна выводить сообщение "Число корректно"*/

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}


public class SemTwoHTOne {

    public static int check(int a) throws InvalidNumberException {
        if (a <= 0) {
            throw new InvalidNumberException("некорректное число");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try { System.out.println("Введите положительное число");
                int num = scanner.nextInt();
                int res = check(num);
                System.out.println("Число корректно: " + res);
            
        } catch (InvalidNumberException exception) {
            System.out.println(exception.getClass().getSimpleName() + " - " + exception.getMessage());
        }
        scanner.close();
    }
}

