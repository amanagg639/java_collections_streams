package regex_junit.regex.advanced_problems;

import java.util.*;
import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        List<String> currencyValues = extractCurrencyValues(text);
        System.out.println(String.join(", ", currencyValues));
    }

    public static List<String> extractCurrencyValues(String text) {
        String regex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> values = new ArrayList<>();
        while (matcher.find()) {
            values.add(matcher.group());
        }

        return values;
    }
}

