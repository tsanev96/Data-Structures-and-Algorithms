package LinkedList;

import Arrays.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*

        // linked lists consists of a group of nodes. Each hold two piece of data, one is a value,one is
        // the address of the next node in the list, that's why they are linked lists because there nodes are linked together
        // First node - HEAD, last - TAIL

        // Lookup by index - O(n) not as fast as arrays
        // Inserting last element O(1)
        // Inserting in the beginning O(1) - not shifting items as in arrays
        // The HEAD/TAIL point to the new added node
        // Inserting in the middle O(n)

        // Deleting
        // BEGINNING: O(1) Unlink the HEAD from the removed item and point it to the second node
        // MIDDLE: O(N)
        // END: O(n) need to traverse the list to find the previous node on the TAIL, we unlink the last node
        // and point the TAIL to the previous NODE
        // Unlinked node gets removed from memory by JAVA's garbage collector

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.addFirst(5);
//        list.removeLast();

//        var array = list.toArray();


        // Custom linked list
        var linkedList = new LinkedList();

        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(1);

        linkedList.removeFirst(); // [10, 20, 30]
        linkedList.removeLast(); // [10, 20]

        System.out.println(linkedList.contains(10));; // true
        System.out.println(linkedList.contains(120));; // false
        System.out.println(linkedList.indexOf(30));; // -1
        System.out.println(linkedList.indexOf(10));; // 0
        System.out.println(linkedList.size());

        var list = new LinkedList();

//        emptyList.removeFirst(); // NoSuchElementException
//        emptyList.removeLast(); // NoSuchElementException
        list.addFirst(10);
        System.out.println(list.size());

        var array = list.toArray();

        System.out.println(Arrays.toString(array));
         */

        /*
        var listToReverse = new LinkedList();

        listToReverse.addLast(10);
        listToReverse.addLast(20);
        listToReverse.addLast(30);
        listToReverse.addLast(40);

        listToReverse.reverse();


         */

//        java.util.LinkedList<String> test = new java.util.LinkedList<>();
//        test.removeFirst();
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();

//        list.addFirst(100000);
        list.addLast(1222);

        System.out.println(list.size());

        /*
                        Array         Linked Lists
            Lookup
                    by index  0(1)       0(n)
                    by value  0(n)       0(n)
            Insert
                Beginning/End 0(n)      0(1)
                Middle        0(n)      0(1)

            Delete
                Beginning     0(n)       0(1)
                Middle        0(n)       0(n)
                End           0(1)       0(n)
         */

    }
}
