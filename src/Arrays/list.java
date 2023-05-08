package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);

//        list.add(45);
//        list.add(69);
//        list.add(45);
//        list.add(23);
//        list.add(32);
//        list.add(345);
//        list.add(4532);
//        list.add(23234);
//        list.contains(69);
//        System.out.println(list);
//        System.out.println(list.contains(69));
//        list.contains(69);
      //  list.set(0,99);
        // list.remove(3);
       // System.out.println(list);

        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
