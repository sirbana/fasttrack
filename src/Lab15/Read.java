package Lab15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    public int tratat() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");

            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("it's not a number!");
                in.next();
            }
        }
    }

    public float tratatF() {
        return 0;
    }

    public int[] inputArray(int n) {
        Scanner in = new Scanner(System.in);
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Enter a number (" + i + "): ");
                    l[i] = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("it's not a number");
                    in.next();
                }
            }
        }

        return l;

    }

    public List<Integer> readList() {
        Scanner in = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();

        while (true) {
            try {
                System.out.print("Enter a number: ");
                l.add(in.nextInt());
            } catch (InputMismatchException e) {
                break;
            }

        }

        return l;
    }
}
