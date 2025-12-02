public class queue_demo_main {
    public static void main(String[] args) {
        Qdemo queue = new Qdemo(10);

        queue.get();
        queue.put('a');
        queue.put('b');
        queue.put('c');
        System.out.println((char) queue.get());
        System.out.println((char) queue.get());
        queue.put('d');
        System.out.println((char) queue.get());
        System.out.println((char) queue.get());
        System.out.println((char) queue.get());
        queue.put('e');
        queue.put('f');
        queue.put('g');
        queue.put('h');
        queue.put('i');
        queue.put('j');
        queue.put('k');

        char a[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        Qdemo queue1 = new Qdemo(a);
        Qdemo queue2 = new Qdemo(queue);
        
        System.out.println((char) queue1.get());
        System.out.println((char) queue1.get());
        System.out.println((char) queue2.get());
        System.out.println((char) queue2.get());
    }
}
