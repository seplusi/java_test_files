public class blockClassMain {
    public static void main(String[] args) {
        blockClass blk1 = new blockClass(10, 2, 5);
        blockClass blk2 = new blockClass(10.0, 2.0, 5.0);
        blockClass blk3 = new blockClass(4, 5, 5);

        System.out.println(blk1.sameBlock(blk3));
        System.out.println(blk1.sameBlock(blk2));
        System.out.println(blk2.sameBlock(blk3));
        System.out.println(blk2.sameBlock(blk1));

        System.out.println(blk1.sameVolume(blk3));
        System.out.println(blk1.sameVolume(blk2));
        System.out.println(blk2.sameVolume(blk3));
        System.out.println(blk2.sameVolume(blk1));

        blk1.poli1(0);
        blk1.poli1('c');
    }
}
