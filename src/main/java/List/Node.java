package List;

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

