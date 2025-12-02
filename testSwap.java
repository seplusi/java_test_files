public class testSwap {
    int a;
    testSwap(int i) {
        this.a = i;
    }

    static void swap(testSwap obj1, testSwap obj2) {
        int aux = obj1.a;
        obj1.a = obj2.a;
        obj2.a = aux;
    }
}
