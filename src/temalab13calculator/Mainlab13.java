package temalab13calculator;


public class Mainlab13 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(5, 8));
        System.out.println(c.sum(4.6, 7.9));
        System.out.println(c.sum(7.8, 5.5));
        System.out.println(c.sum(3.5f, 6.6f, 7.8f));
        System.out.println(c.sum(7, 8, 9, 12));
        LogicalOp13 l = new LogicalOp13();
        l.showArray();
        l.comp();
        l.average();

        String[] s = {"fabulos", "super", "magic"};
        System.out.println(l.check("super1", s));
        int[] numere = {2, 4, 6, 7, 89, 9, 56, 3};
        System.out.println(l.check2(numere, 5));
        l.grila();
        System.out.println(l.mic(numere));
        int[] numere2 = new int[numere.length];
        l.cloneArray(numere, numere2);
        for (int i = 0; i < numere2.length; i++) {
            System.out.print(numere2[i] + " ");
        }
        System.out.println();

    }
}
