package Lab15;

public class LogicalOp15 {
    public void tryCatch(int[] l, int i) {
        try {
            System.out.println(l[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large.");
        }

    }

    public void wait(int x) {
        x *= 1000;
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {

        }

    }
}