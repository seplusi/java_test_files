public class stackClassMain {
    public static void main(String[] args) {
        stackClass stack = new stackClass(10);

        System.out.println(stack.pop());
        System.out.println("stack index is " + stack.getstackIdex());
        stack.push('L');
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop());
        stack.push('U');
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop());
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');
        stack.push('F');
        stack.push('G');
        stack.push('H');
        stack.push('I');
        stack.push('J');
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //J
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //I
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //H
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //G
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //F
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //E
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //D
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //C
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //B
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop()); //A
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop());
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop());
        System.out.println("stack index is " + stack.getstackIdex());
        stack.push('Z');
        System.out.println("stack index is " + stack.getstackIdex());
        System.out.println("Popped char is " + stack.pop());
        System.out.println("stack index is " + stack.getstackIdex());
    
        testSwap obj1 = new testSwap(1);
        testSwap obj2 = new testSwap(2);
        testSwap.swap(obj1, obj2);
        System.out.println("Values are " + obj1.a + " and " + obj2.a);
    }
}
