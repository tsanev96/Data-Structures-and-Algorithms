package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int 4 bytes of memory , second item will be store at the memory location  104, 108...
        // looking up items in an array by their index is super fast where exactly in memory it should access

        int[] numbers = new int[3]; // 0(1)

        // how many items we want to store in an array, if array is bigger than needed,
        // we will have cells that are never filled and waste memory,
        // if its too small it will get filled quickly and will need resizing


        // then we need to create a larger array and copy all the items in the old array into the new array
        // this will be 0(n)

        // Lookup by index O(1)
        // Lookup by value O(n)
        // Insert O(n)
        // Delete O(1) - if deleting last element
        // Delete O(n) - deleting first element, this shifts all the items to the left with one, we should think about the worse case scenario,


        int[] numbers2 = new int[3];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;

//        System.out.println(Arrays.toString(numbers2));
        int[] nums = {10,20,30};

            Array arr = new Array(1);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
//        arr.removeAt(1);
        System.out.println(arr.indexOf(30));
        arr.print();

        // Dynamic arrays - java.util
        // Vector - grows 100% of its size, a method is synchronized - single thread can access that method
        // ArrayList - 50% - the methods of the array list are not synchronized
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        var _nums = list.toArray();
        System.out.println("list: " + list);

    }
}
