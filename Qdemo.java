public class Qdemo {
    private char queue[];
    private int putloc = 0;
    private int getloc = 0;
    private int size;
    
    public Qdemo(int size) {
        queue = new char[size];
        this.size = size;
    }

    public Qdemo(Qdemo q) {
        queue = new char[q.size];
        putloc = q.putloc;
        getloc = q.getloc;
        size = q.size;

        for (int i=0; i<size; i++)
            queue[i] = q.queue[i];
    }

    public Qdemo(char a[]) {
        this.queue = new char[a.length];
        putloc = a.length-1;
        for (int i=0; i<a.length ;i++)
            queue[i] = a[i];
    }

    void put(char ch) {
        if (putloc == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[putloc] = ch;
        putloc++;
    }

    int get() {
        if (putloc == 0 | getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        char value = queue[getloc];
        getloc++;
        return value;
    }
}
