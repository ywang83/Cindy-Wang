class Node<E> {
    public E data;
    public Node<E> next;
    public Node(final E data, final Node<E> next) {
        if (data == null) throw new IllegalArgumentException("data is null");
        this.data = data;
        this.next = next;
    }
    public Node(final E data) { this(data, null); }
    public String toString() {
        return "Node@" + hashCode() + "(" + data + (next != null ? ", Node@" + next.hashCode() + ")" : ")");
    }
}
Node<String> hello = new Node<String> ("hello");
Node<String> cindy = new Node<String> ("Cindy");
Node<String> what = new Node<String> ("what");
Node<String> up = new Node<String> ("up");
hello.next=cindy;
cindy.next=what;
what.next=up;
LinkedList<Node<String>> list = new LinkedList<Node<String>>();
List<String> myList = new LinkedList<>(Arrays.asList("hello", "Cindy", "what", "up"));
<E> void printNode(Node<E> curr) {
    if (curr == null) {
        return;
    }
    while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
    System.out.println(curr);
}
printNode(hello)
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
deleteNode(hello,3)
printNode(hello)
<E> Node<E> insertAfter(Node<E> previous, Node<E> data) {
    data.next = previous.next;
    previous.next = data;
    return previous;
}
insertAfter(cindy, what)
printNode(hello)
up.next=hello;
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
printNodeCycle(hello,hello)
final List<String> myList = new LinkedList<>(Arrays.asList("hello", "Cindy", "what", "up"));
private static void printList(List<String> myList) {
        final Iterator i = myList.iterator();
        while(i.hasNext()){
            String vaule = (String) i.next();
            System.out.print(vaule + " ");
        }
}
printList(myList);
/save -history myhistory.jsh
