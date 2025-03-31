package basic;

public class StringUtilityMethod {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String toUpperCase(String str){
        return str.toUpperCase();
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i) != str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
