public class Temalab10 {
    public static void main(String[] args) {
        System.out.println("Media este: " + media(4, 5, 8));
        System.out.println("Restul impartirii este: " + rest(5, 9));
        System.out.println("Temperatura in grade Celsius este: " + convertToC(41));
        System.out.println("Distanta in metri este: " + convertToM(1000));
        distanta(1000, 0, 34, 45);
        piramida();
        omulet();
    }

    public static float media(float x, float y, float z) {
        return (x + y + z) / 3;
    }

    public static int rest(int x, int y) {
        return (x % y);
    }

    public static float convertToC(float f) {
        return 5.0f / 9.0f * (f - 32);
    }

    public static float convertToM(float inch) {
        return inch * 0.0254f;
    }

    public static void distanta(float x, int h, int m, int s) {
        float ms = x / (h * 3600 + m * 60 + s);
        System.out.println("m/s: " + ms);
        System.out.println("km/h : " + ms * 3.6);
        System.out.println("mp/h : " + ms * 2.237);

    }

    public static void piramida() {
        System.out.println("  J    a  v   v   a");
        System.out.println("  J   a  a v  v  a  a");
        System.out.println("J  J  aaaaa V V  aaaaa");
        System.out.println(" JJ  a    a v v  a   a");
    }

    public static void omulet() {
        System.out.println(" +\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '_' |");
        System.out.println(" +-----+");


    }


}

