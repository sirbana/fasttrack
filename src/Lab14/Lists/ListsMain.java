package Lab14.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<String> listaStr = new ArrayList<>();
        listaStr.add("mere");
        listaStr.add("pere");
        listaStr.add("struguri");
        showList(listaStr);
        System.out.println(listaStr);
        List<Integer> listInt = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4)
        );

        List<Integer> listInteger = Arrays.asList(1, 4, 7);

        addLast(listInt, 9);
        showFrom(listInt, 3);
        showReverse(listInt);
        addAt(listaStr, "zmeura", 2);
        addFirst(listaStr, "prune");
        showPos(listInteger);
        max(listInt);

    }

    public static void showList(List<String> listuta) {
        for (String s : listuta) {
            System.out.println(s);
        }


    }

    public static void addLast(List<Integer> l, int x) {
        l.add(x);
        System.out.println(l);
    }

    public static void showFrom(List<Integer> t, int x) {
        boolean show = false;
        for (Integer r : t) {
            if (r == x) {
                show = true;
            }
            if (show) {
                System.out.print(r + " ");
            }
        }
        System.out.println();
    }

    public static void showReverse(List<Integer> a) {
        Collections.reverse(a);
        System.out.println(a);
    }

    public static void addAt(List<String> l, String x, int i) {
        l.add(i, x);
        System.out.println(l);
    }

    public static void addFirst(List<String> l, String x) {
        l.add(0, x);
        System.out.println(l);
    }

    public static void showPos(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Pe pozitia " + i + " se afla " + l.get(i));

        }
    }

    public static void max(List<Integer> l) {
        int max = l.get(0);
        for (int x : l) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }

    public static void maxColectii(List<Integer> l) {
        System.out.println(Collections.max(l));
    }
}