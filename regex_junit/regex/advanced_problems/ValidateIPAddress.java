package regex_junit.regex.advanced_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)(\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)){3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        System.out.println(matcher.matches());
    }
}
