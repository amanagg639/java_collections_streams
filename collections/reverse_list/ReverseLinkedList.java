package collections.reverse_list;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i<n; i++) {
           ll.add(scanner.nextInt());
        }
        reverseLL(ll);
        System.out.println(ll);
    }

    private static void reverseLL(LinkedList<Integer> ll) {
        int i=0;
        int j= ll.size()-1;
        while(i<j){
            int temp = ll.get(i);
            ll.set(i, ll.get(j));
            ll.set(j, temp);
            i++;
            j--;
        }
    }
}
