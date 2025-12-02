public class stackClass {
    private char ch[];
    private int stackIndex = 0;

    stackClass(int numChars) {
        this.ch = new char[numChars];
    }

    void push(char c) {
        if (stackIndex < ch.length) ch[stackIndex++] = c;
        else System.out.println("Stack is full. Empty it first");
    }

    char pop() {
        if (stackIndex > 0) {
            stackIndex--;
            return ch[stackIndex];
        }
        else {
            System.out.println("Stack is empty. Add items first");
            return ' ';
        }
    }

    int getstackIdex() {
        return stackIndex;
    }
}
