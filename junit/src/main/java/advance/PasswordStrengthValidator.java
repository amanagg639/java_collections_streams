package advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthValidator {
    public static boolean checkPassword(String pass){
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }
}
