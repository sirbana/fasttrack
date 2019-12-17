package temalab11;

public class lab11 {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(45, 67);
        System.out.println("The bigger number is " + biggest);
        op.checkStringAndNumber();
        op.checkEquality();
        op.snow(9);
        op.numarPrimit(2);
        System.out.println(op.isNumberEven(7));
        System.out.println(op.isEligibleToVote(34));
        System.out.println(op.greatestNumber(3, 56, 56));

        Calculator calc = new Calculator();
        System.out.println(calc.subtract(78, 56));
        System.out.println(calc.add(2, 5));
        System.out.println(calc.multiply(7, 8));
        System.out.println(calc.divide(9, 9));
    }
}
