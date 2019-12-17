package temalab11;

public class LogicalOp {
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
        if (z % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int x) {
        if (x > 18) {
            return true;
        } else {
            return false;
        }
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
}
