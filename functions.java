import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // sum();
        // int ans = sum2();
        int ans = sum3(3, 5);
        System.out.println(ans);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("The final sum is : " + sum);
    }

    // with a return type
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    // *****************java don't have any pass by refrence it has only pass by
    // value*******************

    // with parameters
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
