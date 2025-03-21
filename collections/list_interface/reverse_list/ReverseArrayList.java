package collections.list_interface.reverse_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of arrayList: ");
        int len = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<len; i++){
            list.add(scanner.nextInt());
        }
        reverseList(list);
        System.out.println(list);
    }

    private static void reverseList(ArrayList<Integer> list) {
        int i=0;
        int j= list.size()-1;
        while(i<j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}
