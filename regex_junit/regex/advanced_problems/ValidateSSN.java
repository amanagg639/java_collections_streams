package regex_junit.regex.advanced_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ssn = scanner.nextLine();
        String regex = "^(\\d{3}-\\d{2}-\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);
        System.out.println(matcher.matches());
    }
}
