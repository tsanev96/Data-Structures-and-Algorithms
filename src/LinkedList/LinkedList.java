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



    public int size() {
        return size;
    }

}