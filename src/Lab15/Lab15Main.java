package Lab15;

public class Lab15Main {
    public static void main(String[] args) {
        Read read = new Read();
        read.tratat();
        read.inputArray(1);
        System.out.println(read.readList());
        LogicalOp15 logic = new LogicalOp15();
        logic.wait(7);
        int[] arr = {3, 5, 5, 7, 8};
        logic.tryCatch(arr, 10);
    }
}
