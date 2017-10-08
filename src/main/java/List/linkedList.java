package List;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedList {
//    private Node<String> hello;

    public static void main(String[] args) {
        Node<String> hello = new Node<String>("hello");
        Node<String> roger = new Node<String>("Roger");
        Node<String> cindy = new Node<String>("Cindy");
        Node<String> what = new Node<String>("what");
        Node<String> up = new Node<String>("up");

        hello.next = cindy;
        hello.next = roger;
        cindy.next = what;
        what.next = up;
//        up.next = hello;

        final List<String> myList = new LinkedList<>(Arrays.asList("hello", "Cindy", "what", "up"));
        List<Node<String>> myList1 = new LinkedList<Node<String>>();
//        final Iterator i = myList.iterator();
//      TODO while loop using i.hasNext() and i.next()

        String[] myArray = {"hello", "Cindy", "what", "up"};

//        LinkedList<Node<String>> list = new LinkedList<Node<String>>();
        linkedList list = new linkedList();
//        printList(myList);

//        list.printNodeCycle(hello,hello);
        list.printNode(hello);
        list.deleteNode(hello, 3);
        list.printNode(hello);
        list.insertAfter(cindy,what);
        list.printNode(hello);
    }

    private static void printList(List<String> myList) {
        final Iterator i = myList.iterator();
        while(i.hasNext()){
            String vaule = (String) i.next();
            System.out.print(vaule + " ");
        }
    }

//    private static void printArray(Arrays myArray) {
//        final Iterator i = myArray.iterator();
//        while(i.hasNext()){
//            String vaule = (String) i.next();
//            System.out.print(vaule + " ");
//        }
//    }

    <E> void printNode(Node<E> curr) {
        if (curr == null) {
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
//            System.out.print(curr);
            curr = curr.next;
        }
        System.out.println(curr);
    }

    <E> void printNodeCycle(Node<E> curr, Node<E> head) {
        if (curr == null) {
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
            if (curr.next==head) {
                break;
            }
        }
        System.out.println(curr.data);
    }

    <E> Node<E> deleteNode(Node<E> curr, int position) {
        if (position == 1) {
            curr = curr.next;
            curr.next = null;
            return curr;
        } else {
            Node<E> previoius = curr;
            int i = 1;
            while (i < position - 1) {
                previoius = previoius.next;
                i++;
            }
            Node<E> current = previoius.next;
            previoius.next = current.next;
            current.next = null;
            return current;
        }
    }

    <E> Node<E> insertAfter(Node<E> previous, Node<E> data) {
        data.next = previous.next;
        previous.next = data;
        return previous;
    }
}