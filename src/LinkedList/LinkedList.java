package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    private boolean hasOnlyOneNode() {
        return head == tail;
    }

    private boolean resetHeadAndTailIfNeeded() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (hasOnlyOneNode()) {
            head = tail = null;
            size = 0;
            return true;
        }

        return false;
    }

    private Node getPrevious(Node node) {
        var current = head;
        while (current != null) {
            if (current.next == node)   {
                return current;
            };
            current = current.next;
        }
        return null;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node; // points to the new node
        }

        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public int indexOf(int item) {
        var current = head;
        int index = 0;

        while (current != null) {
            if (current.value == item)  return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (resetHeadAndTailIfNeeded()) return;

        // [10 -> 20 -> 30]
        var second = head.next;
        // This is no more pointing to 20, so java will remove it from memory (no pointing to anything). Garbage collector.
        head.next = null; // [10  20 -> 30]
        head = second;
        size--;
    }

    public void removeLast() {
        if (resetHeadAndTailIfNeeded()) return;

        tail = getPrevious(tail);
        assert tail != null;
        tail.next = null; // Set to null so the new last node does not point to the old last node
        size--;
    }

    public int[] toArray() {
        var array = new int[size];
        var index = 0;
        var current = head;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    // check todo
    public void reverse() {
        if (isEmpty()) return;
        var previous = head; // 10
        var current = previous.next; // 20
        while (current != null) {
            var next = current.next; // 30
            current.next = previous; // 20 -> 10
            previous = current; // 20
            current = next; // 30 -> null
        }

        // last iteration
        //              head
        // [10 <- 20 <- 30]
        //              p    c    n

        // head still points to 10 (the old head)

        tail = head;   // old head (10) becomes new tail
        tail.next = null; // cut dangling link
        head = previous;  // new head is 30
    }


    public int getKthFromTheEnd(int k) {
        if (k <= 0) throw new IllegalArgumentException();
        if (isEmpty()) throw new IllegalStateException();

        if (k == 1) return tail.value;

        var first = head;
        var second = head;
        for (var i = 0; i < k - 1; i++) {
            second = second.next;
            if (second == null) throw new IllegalArgumentException();
        }

        while (second != tail) {
            first = first.next;
            second = second.next;
        }

        return first.value;
        // Solution 2: when u know the size
//        Node current = head;
//        int steps = size - k; // steps to reach the target from start
//        for (int i = 0; i < steps; i++) {
//            current = current.next;
//        }
//        return current.value;
    }

    /** Assume that you don’t know the size of the list ahead of time */
    public void printMiddleElements() {
       // Floyd's cycle finding algorithm
       if (isEmpty()) throw new IllegalStateException();

       var slow = head;
       var fast = head;
       while (fast != tail && fast.next != tail) {
           slow = slow.next;
           fast = fast.next.next;
       }

       var isOddList = fast == tail;

       if (isOddList) System.out.println("Middle element: " + slow.value);
       else System.out.println("Middle elements: " + slow.value + ", " + slow.next.value);
    }

    public int size() {
        return size;
    }

}