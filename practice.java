

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        System.out.print("Enter any Number ");
        Scanner input = new Scanner(System.in);

        // int num = input.nextInt();
        // System.out.println("Your number is " + num);

        // String name = input.next();
        // System.out.println(name);
        // System.out.println(input.nextLine());

        // float marks = input.nextFloat();
        // System.out.println(marks);


        //--------------------- loops------------------------

        float temp = input.nextFloat();

        float tempf = (temp*9/5)+32;
        System.out.println(tempf);

    }
}
