import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num  = input.nextFloat();
        // int num = input.nextInt();
        // System.out.println(num);

        //typecasting

        // int num = (int)(67.7);
        // System.out.println(num);

        //automatic type promotion in expression

        // int a =257;
        // byte b = (byte)(a); 

        //we can store max 256 in a byte 
        //if we store more than 256 in a byte than it will output remainder

        // byte a =40 ;
        // byte b=50;
        // byte c=100;
        // int d = a*b /c;

        // System.out.println(d);

        // byte b = 40;
        // b= b *3; this give error because we are doing evaluations on byte with integers 

        int num = 'a';
        System.out.println("नमसते");
    }
}
