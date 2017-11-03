package lab6.arrayqueue;

public class Main {
    public static void main(String[] args){
        FixedArrayQueue <String> q = new FixedArrayQueue<>();
       System.out.println( q.poll());
        q.offer("Hello");
        q.offer("World");
//        System.out.println(q.poll());
        q.offer("What");
//        System.out.println(q.poll());
        q.offer("up");
        q.offer("how");
        System.out.println(q.offer("are"));

//        System.out.println(q.toString());

    }
}
