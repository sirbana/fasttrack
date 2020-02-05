package temalab13calculator;

public class LogicalOp13 {
    public void showArray() {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
            System.out.println(a[i]);
        }
    }

    public void showEven() {
        int[] e = new int[100];

        for (int i = 0; i <= 100; i++) {
            i = 2;
            i += 2;
            System.out.println(e[i]);

        }
    }

    public void comp() {
        int[] t = {6, 7, 8, 12, 78, 99};
        int sum = 0;
        for (int num : t) {
            sum = sum + num;
        }
        System.out.println(sum);
    }

    public void average() {
        int[] f = {7, 34, 6, 8};
        int sum = 0;
        for (int i = 0; i < f.length; i++) {
            sum = sum + f[i];
        }
        int average = sum / f.length;
        System.out.println(average);
    }

    public boolean check(String even, String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == even) {
                return true;
            }
        }
        return false;
    }

    public int check2(int[] numere, int x) {
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] == x) {
                return i;
            }

        }
        return -1;
    }

    public void grila() {
        char[] c = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }

    public int[] removeElement(int[] arr, int x) {
        // 1. cautam in array pozitia elementului `x`
        int pozitieX = check2(arr, x);
        if (pozitieX == -1) {
            return arr;
        }

        // 2. alocam array-ul (fara elementul `x`, care in punctul acesta stim ca exista!)
        int[] dst = new int[arr.length - 1];

        // 3. copiem de la [0, pozitia elementului `x`) (fara elementul `x`)
        for (int i = 0; i < pozitieX; i++) {
            dst[i] = arr[i];
        }

        // 4. copiem de la `x` + 1 (adica sarim peste `x`) pana la final
        for (int i = pozitieX + 1; i < arr.length; i++) {
            dst[i - 1] = arr[i];
        }

        return dst;
    }

    public int mic(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int[] arr2 = removeElement(arr, min);
        min = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }
        return min;


    }

    public void cloneArray(int[] src, int[] dst) {
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }
}
