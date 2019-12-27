package Lab14.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OptionalListMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 67, 9, 3, 4, 8);
        swap(list, 2, 4);
        System.out.println(list);
        swapC(list, 2, 4);
        System.out.println(list);
        System.out.println(getEven(list));
        sort(list);
        System.out.println(list);
    }

    public static void swap(List<Integer> l, int i, int j) {
        int t = l.get(i);
        l.set(i, l.get(j));
        l.set(j, t);
    }

    public static void swapC(List<Integer> l, int i, int j) {
        Collections.swap(l, i, j);
    }

    public static List<Integer> getEven(List<Integer> l) {
        List<Integer> ret = new ArrayList<>();
        for (int x : l) {
            if (x % 2 == 0) {
                ret.add(x);
            }
        }
        return ret;
    }

    public static void sort(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(i) < l.get(j)) {
                    Collections.swap(l, i, j);
                }
            }

        }
    }
}
