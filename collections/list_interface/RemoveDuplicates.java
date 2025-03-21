package collections.list_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(scanner.nextInt());
        }
        removeDuplicate(list);
        System.out.println(list);
    }

    private static void removeDuplicate(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<list.size(); i++){
            int num = list.get(i);
            if(set.contains(num)){
                list.remove(num);
                i--;
            }
            else set.add(num);
        }
    }
}
