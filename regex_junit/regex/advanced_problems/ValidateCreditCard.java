package regex_junit.regex.advanced_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Visa Card Number:");
        String visa = scanner.nextLine();
        System.out.println("Enter Master Card Number");
        String master = scanner.nextLine();

        String visaRegex = "\\b4(\\d){15}\\b";
        String masterRegex = "\\b5(\\d){15}\\b";

        Pattern pattern = Pattern.compile(visaRegex);
        Matcher matcher = pattern.matcher(visa);
        System.out.println(matcher.matches());
    }
}
