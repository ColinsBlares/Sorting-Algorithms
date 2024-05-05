import java.util.Stack;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для проверки на палиндром: ");
        String input = scanner.nextLine();

        // Очистка от пробелов и перевод в нижний регистр для корректного сравнения
        input = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(input)) {
            System.out.println("Слово является палиндромом.");
        } else {
            System.out.println("Слово не является палиндромом.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Заполнение стека символами строки
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Сравнение символов в обратном порядке с исходной строкой
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;  // Если символы не совпадают, это не палиндром
            }
        }

        return true;  // Все символы совпали, значит это палиндром
    }
}
