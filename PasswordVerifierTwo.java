import java.util.Scanner;

/* Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
*/



public class PasswordVerifierTwo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        System.out.print("Введите пароль (более 8 символов, хотя бы одна цифра и заглавная буква): ");
        String password = sc.nextLine();
        String res = checkPassword(password);
        System.out.println("Корректный пароль: " + res);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
       
    }
    

    public static String checkPassword(String password) throws Exception {

        if (password.length() < 8) {
            throw new Exception("Создайте пароль более 8 символов");
        } 

        boolean containsNumber = false;

        for (int i = 0; i < password.length(); i++){
            char x = password.charAt(i);
            if (Character.isDigit(x)){  // Метод Character.isDigit проверяет является ли символ x цифрой
                containsNumber = true;
                break;
            }
        }

        if (!containsNumber) {
            throw new Exception("В вашем пароле должна быть хотябы одна цифра");
        }

        boolean containsCapitalLetter = false;

        for (int i = 0; i < password.length(); i++){
            char x = password.charAt(i);
            if (Character.isUpperCase(x)){   // Метод Character.isUpperCase проверяет является ли символ x заглавной буквой
                containsCapitalLetter = true;
                break;
            }
        }

        if (!containsCapitalLetter) {
            throw new Exception("В вашем пароле должна быть хотя бы одна заглавная буква");
        }
        
        
    return password;

    
    }
}


