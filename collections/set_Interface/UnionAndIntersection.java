package collections.set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UnionAndIntersection {
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
        HashSet<Integer> union = unionSet(set1, set2);
        HashSet<Integer> intersection = intersectionSet(set1, set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    private static HashSet<Integer> intersectionSet(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer>set = new HashSet<>();
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()){
            int value = i.next();
            if(set2.contains(value)){
                set.add(value);
            }
        }
        return set;
    }

    private static HashSet<Integer> unionSet(HashSet<Integer> set1, HashSet<Integer> set2) {
       HashSet<Integer>set = new HashSet<>();
        Iterator<Integer> i = set1.iterator();
        while(i.hasNext()){
            set.add(i.next());
        }
        i = set2.iterator();
        while(i.hasNext()){
            set.add(i.next());
        }
        return set;
    }
}
