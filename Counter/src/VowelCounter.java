import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class VowelCounter {

    public static void main(String[] args) {
        // Захардкоденный путь к файлу
        String filePath = "src/file.txt"; // Замените на свой путь к файлу

        Map<Character, Integer> vowelCounts = countVowelsInFile(filePath);

        // Вывод результатов
        if (vowelCounts != null) {
            boolean foundVowel = false;
            for (Map.Entry<Character, Integer> entry : vowelCounts.entrySet()) {
                if (entry.getValue() > 0) {
                    System.out.printf("Буква '%c' встречается %d раз(а).\n", entry.getKey(), entry.getValue());
                    foundVowel = true;
                }
            }
            if (!foundVowel) {
                System.out.println("В файле не найдены гласные буквы.");
            }
        }
    }

    private static Map<Character, Integer> countVowelsInFile(String filePath) {
        Map<Character, Integer> vowelCounts = new HashMap<>();
        // Список гласных букв для подсчёта
        String vowels = "AEIOUYaeiouyАЕЁИОУЫЭЮЯаеёиоуыэюя";
        for (char vowel : vowels.toCharArray()) {
            vowelCounts.put(vowel, 0);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = reader.read()) != -1) {
                char character = (char) c;
                if (vowels.indexOf(character) != -1) {
                    vowelCounts.put(character, vowelCounts.get(character) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }

        return vowelCounts;
    }
}
