package LinkedList;

import Arrays.Array;

public class Main {
    public static void main(String[] args) {
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

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addFirst(10);


    }
}
