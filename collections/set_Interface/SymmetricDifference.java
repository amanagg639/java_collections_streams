package collections.set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SymmetricDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len1 = scanner.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < len1; i++) {
            set1.add(scanner.nextInt());
        }
        int len2 = scanner.nextInt();
        HashSet<Integer>set2 = new HashSet<>();
        for (int i = 0; i < len2; i++) {
            set2.add(scanner.nextInt());
        }
        HashSet<Integer> symmetricDiffSet = symmetricDiff(set1, set2);
        System.out.println("Symmetric Difference: " + symmetricDiffSet);
    }
    private static HashSet<Integer> symmetricDiff(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer>set = new HashSet<>();
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()){
            int value = i.next();
            if(set2.contains(value)){
                continue;
            }
            set.add(value);
        }

        i = set2.iterator();
        while (i.hasNext()){
            int value = i.next();
            if(set1.contains(value)){
                continue;
            }
            set.add(value);
        }
        return set;
    }
}
