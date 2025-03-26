package regex_junit.regex.advanced_problems;

import java.util.*;
import java.util.regex.*;

public class ExtractLanguage {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        List<String> languages = extractLanguages(text);
        System.out.println(String.join(", ", languages));
    }

    public static List<String> extractLanguages(String text) {
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C|C#|Ruby|PHP|Swift|Kotlin|Rust|TypeScript|R)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        return languages;
    }
}

