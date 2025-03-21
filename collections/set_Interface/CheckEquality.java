package collections.set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len1 = scanner.nextInt();
        HashSet<Integer>set1 = new HashSet<>();
        for (int i = 0; i < len1; i++) {
            set1.add(scanner.nextInt());
        }
        int len2 = scanner.nextInt();
        HashSet<Integer>set2 = new HashSet<>();
        for (int i = 0; i < len2; i++) {
            set2.add(scanner.nextInt());
        }
        boolean check = checkEquality(set1, set2);
        System.out.println(check);
    }

    private static boolean checkEquality(HashSet<Integer> set1, HashSet<Integer> set2) {
        if(set1.size() != set2.size())return false;
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()){
            if(!set2.contains(i.next()))return false;
        }
        return true;
    }
}
