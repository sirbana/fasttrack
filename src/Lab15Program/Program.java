package Lab15Program;

import java.util.Scanner;


public class Program {

    private Scanner input = new Scanner(System.in);

    public void hello() {
        System.out.println("Hello!");

        while (true) {
            System.out.println("Choose an option!\n 1. math\n 0. exit");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    math();
                    break;
                case 0:
                    return;
            }
        }
    }

    public void math() {
        Temalab9 ex = new Temalab9();

        while (true) {
            System.out.println("Choose an option!\n exercitiu 1 \n exercitiu 2 \n exercitiu 3\n exercitiu 4");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Temalab9.exercitiu1();
                    break;
                case 2:
                    System.out.println(Temalab9.exercitiu2(3, 5));
                    break;
                case 3:
                    Temalab9.exercitiu3(5, 7);
                    break;
                case 4:
                    Temalab9.exercitiu4();
                    break;
                case 0:
                    return;
            }
        }
    }

    public void login() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input user and password:");
            Login login = new Login(input.next(), input.next());

            if (login.isValid()) {
                return;
            }
        }

        System.exit(1);
    }

}
