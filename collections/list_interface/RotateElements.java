package collections.list_interface;

import java.util.ArrayList;
import java.util.Scanner;


public class RotateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        rotate(list, k);
        System.out.println(list);
    }

    private static void rotate(ArrayList<Integer> list, int k) {
        reverseList(list, 0, k-1);
        reverseList(list, k, list.size()-1);
        reverseList(list, 0, list.size()-1);
    }

    private static void reverseList(ArrayList<Integer> list, int i, int j) {
        while(i<j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

}
