package collections.list_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<len; i++){
            list.add(scanner.next());
        }
        HashMap<String, Integer>map = new HashMap<>();
        for(String s : list){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        System.out.println(map);
    }
}
