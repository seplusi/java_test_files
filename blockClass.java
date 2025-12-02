public class blockClass {
    private int ln, wd, dp, volume;

    blockClass(int ln, int wd, int dp) {
        this.ln = ln;
        this.wd = wd;
        this.dp = dp;
        volume = ln*dp*wd;
    }

    blockClass(double ln, double wd, double dp) {
        this.ln = (int) ln;
        this.wd = (int) wd;
        this.dp = (int) dp;
        volume = this.ln*this.dp*this.wd;
    }

    public boolean sameBlock(blockClass blk) {
        if (ln == blk.ln & wd == blk.wd & dp == blk.dp)
            return true;
        return false;
    }

    public boolean sameVolume(blockClass blk) {
        if (volume == blk.volume)
            return true;
        return false;
    }

    public void poli1(int a) {
        System.out.println("Printing int " + a);
    }

    public void poli1(char a) {
        System.out.println("Printing char " + a);
    }
}
