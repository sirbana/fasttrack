package temalab13calculator.Optional;

public class Maincalc {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 9, 0, 34, 1, 7, 3};
        System.out.println(min2(arr));

        printArray(insert(arr, -1, 4));

        minmax(arr);
        printArray(reverse(arr));
        duplicate(arr);
        String[] stringut = {"ana", "mere", "bogdan", "iubire", "mere"};
        String[] stringut2 = {"ana", "merge", "piata"};
        common(stringut, stringut2);
        modif(arr);
        printArray(arr);

    }

    public static void printArray(int[] var) {
        for (int i = 0; i < var.length; i++) {
            System.out.print(var[i] + " ");

        }
        System.out.println();

    }


    private static int min2(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        int min2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min2 > arr[i] && arr[i] > min) {
                min2 = arr[i];
            }

        }
        return min2;
    }

    public static int[] insert(int[] arr, int x, int index) {
        int[] copy = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            copy[i] = arr[i];
        }
        copy[index] = x;
        for (int i = index; i < arr.length; i++) {
            copy[i + 1] = arr[i];
        }
        return copy;
    }

    public static void minmax(int[] ar) {
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }

        }
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }


        }
        System.out.println(min + " " + max);

    }

    public static int[] reverse(int[] arr) {
        int[] ret = new int[arr.length];
        int index = ret.length - 1;
        for (int i = 0; i < arr.length; i++) {
            ret[index] = arr[i];
            index--;
        }
        return ret;
    }

    public static void duplicate(int[] dupli) {
        for (int i = 0; i < dupli.length; i++) {
            for (int j = i + 1; j < dupli.length; j++) {
                if (dupli[i] == dupli[j]) {
                    System.out.print(dupli[i] + " ");
                }
            }
        }
        System.out.println();

    }

    public static void common(String[] com, String[] doi) {
        for (int i = 0; i < com.length; i++) {
            for (int j = 0; j < doi.length; j++) {
                if (com[i] == doi[j]) {
                    System.out.println(com[i] + " ");
                }
            }

        }
    }

    public static void modif(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

            }

        }
    }
}