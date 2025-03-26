package regex_junit.regex.basic_regex_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String regex = "^[A-Z]{2}[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);
        if(matcher.matches()){
            System.out.println("Valid");
        }
        else System.out.println("Invalid");

    }
}
