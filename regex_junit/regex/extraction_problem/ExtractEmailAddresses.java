package regex_junit.regex.extraction_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddresses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "\\b[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean flag = false;
        while (matcher.find()){
            System.out.println(matcher.group());
            flag = true;
        }
        if (!flag){
            System.out.println("matching pattern is not present");
        }
    }
}
