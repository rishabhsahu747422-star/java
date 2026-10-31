import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // switch (fruit) {
        // case "apple":
        // System.out.println("A red sweet");
        // break;
        // case "Mango":
        // System.out.println("King of Fruits");
        // break;
        // case "Banana":
        // System.out.println("something Yellow");
        // break;
        // default:
        // System.out.println("Please get some fruits");
        // break;
        // }

        // int Day = in.nextInt();

        // switch (Day) {
        // case 1 -> System.out.println("Sunday");
        // case 2 -> System.out.println("Monday");
        // case 3 -> System.out.println("Tuesday");
        // case 4 -> System.out.println("Wednesday");
        // case 5 -> System.out.println("Thrusday");
        // case 6 -> System.out.println("Friday");
        // case 7 -> System.out.println("Saturday");
        // }

        /*
         * -----------------------------Nested Switch
         * case-----------------------------------------------
         */

        int employee = in.nextInt();
        String detail = in.next();

        switch (employee) {
            case 1:
                System.out.println("Employye 1");
                break;
            case 2:
                System.out.println("Employee 2");
                break;
            case 3:
                switch (detail) {
                    case "name":
                        System.out.println("Rahul");
                        break;
                }
                System.out.println("Employee 2");
                break;
            default:
                break;
        }
    }
}
