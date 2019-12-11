package temalab9;

public class Temalab9 {
    public static void main(String[] args) {
        exercitiu1();
        System.out.println("Rezultatul adunarii este: " + exercitiu2(2, 5));
        exercitiu3(10, 3);
        exercitiu4();
    }

    public static void exercitiu1() {
        System.out.println("Hello");
        System.out.println("Ana Maria");
    }

    public static int exercitiu2(int x, int y) {
        return (x + y);
    }

    public static void exercitiu3(float x, float y) {
        System.out.println("Rezultatul impartirii este: " + x / y);
    }

    public static void exercitiu4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

}
