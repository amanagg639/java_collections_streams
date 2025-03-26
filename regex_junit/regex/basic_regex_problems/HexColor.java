package regex_junit.regex.basic_regex_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColor {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String colorCode = scanner.nextLine();
            String regex = "^#[0-9A-Fa-f]{6}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(colorCode);
            if(matcher.matches()){
                System.out.println("Valid");
            }
            else System.out.println("Invalid");
    }
}
