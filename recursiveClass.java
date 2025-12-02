public class recursiveClass {
    String var;
    char ch[];
    int index;

    recursiveClass(String s) {
        this.var = s;
        this.ch = var.toCharArray();
        this.index = this.ch.length - 1;
    }

    void printBackwards() {
        System.out.println(ch[index]);
        if (index != 0) {
            index--;
            printBackwards();
            
        }
    }
}
