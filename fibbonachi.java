import java.util.Scanner;

public class fibbonachi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // int a = 0;
        // int b = 1;
        // int count =2;

        // while (n>=count){
        //     int temp = b;
        //     b= b +a;
        //     a=temp;
        //     count++;
        // }
        // System.out.println(b);


        int count = 0;
        int num = 85988985;

        while(num>0){
            int rem = num%10;
            if (rem == 5){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);

    }
}
