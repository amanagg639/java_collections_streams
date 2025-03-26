package regex_junit.regex.extraction_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "\\b(https)|(http)\\:[a-z]+//\\b";
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
