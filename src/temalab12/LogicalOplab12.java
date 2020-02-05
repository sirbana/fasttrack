package temalab12;

public class LogicalOplab12 {
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public void checkLength() {
        String first = "FastTrackIt";

        String second = "Fuga";

        if (first.equals(second)) {
            System.out.println("Learning text comparison.");
        } else if (!first.equals(second)) {
            System.out.println("Got to try some more!");
        }
    }

    public void checkEquality() {
        int number = 4;
        if (number > 3 && number != 4) {
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            System.out.println("The number is equal to 4");
        } else if (number < 3) {
            System.out.println("The number is lower than 3.");
        }


    }

    public void checkStringAndNumber() {
        String text = "FastTrackIt";
        int number = 3;
        if (text.equals("FastTrackIt") && number <= 3) {
            System.out.println(text + number);
        } else if (!text.equals("FastTrackIt") && number > 4) {
            System.out.println("number + text");
        }

    }

    public void snow(int x) {
        if (x > 8 || x == 6) {
            System.out.println("The amount of snow this winter was(cm):" + x);
        } else {
            System.out.println("The forecast snow is(cm):" + x);
        }
    }

    public void numarPrimit(int y) {
        switch (y) {
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            case 3:
                System.out.println("The number is 3.");
                break;
            default:
                System.out.println("Te number is greater than 3.");
                break;
        }
    }

    public boolean isNumberEven(int z) {
        return z % 2 == 0;
    }

    public boolean isEligibleToVote(int x) {
        return x > 18;
    }

    public int greatestNumber(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else if (z >= x && z >= y) {
            return z;
        } else {
            return x;
        }
    }

    public void showNumbers(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);

        }

    }

    public void showNeg(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void interval(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void interval2(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }
    }

    public void show100() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

    }

    public void showOdd() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }

    }

    public int calc(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;

        }
        return sum;
    }

    public int calc1(int x) {
        int sum = this.calc(x);
        return sum / (100 - x + 1);


    }

    public void pattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void show100w(int number) {
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }

    public void showNega(int number) {
        while (number >= -100) {
            System.out.println(number);
            number--;
        }
    }

    public void numaratoare(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    public void numara(int x, int y) {
        int min;
        int max;
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
        while (min <= max) {
            System.out.println(min);
            min++;
        }
    }

    public void pare100() {
        int x = 2;
        while (x <= 100) {
            System.out.println(x);
            x += 2;
        }
    }

    public void impare100() {
        int x = 1;
        while (x <= 100) {
            System.out.println(x);
            x += 2;
        }
    }

    public void addInterval() {
        int x = 111;
        int y = 8899;
        int sum = 0;
        int count = 0;
        while (x <= y) {
            sum += x;
            x++;
            count++;


        }
        System.out.println(sum);
        System.out.println(sum / count);
    }

    public void impartire7(int x, int y) {
        while (x <= y) {
            if (x % 7 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    public void fibonaci() {
        int x = 1;
        int y = 1;
        int i = 0;
        while (i < 20) {
            int newElement = x + y;
            System.out.println(newElement);
            x = y;
            y = newElement;
            i++;
        }
    }

    public void CozaWozaLoza() {
        int x = 1;
        while (x <= 110) {
            if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
                System.out.print("CozaLozaWoza");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.print("CozaLoza");
            } else if (x % 3 == 0 && x % 7 == 0) {
                System.out.print("CozaWoza");
            } else if (x % 5 == 0 && x % 7 == 0) {
                System.out.print("WozaLoza");
            } else if (x % 3 == 0) {
                System.out.print("Coza");
            } else if (x % 5 == 0) {
                System.out.print("Loza");
            } else if (x % 7 == 0) {
                System.out.print("Woza");
            } else {
                System.out.print(x);
            }
            System.out.print(" ");
            if (x % 11 == 0) {
                System.out.println();
            }
            x++;

        }
    }

    public void sumAndAverage() {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            counter++;
        }
        System.out.println(sum / counter);


    }
}

