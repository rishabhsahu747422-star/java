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


        // int count = 0;
        // int num = 85988985;

        // while(num>0){
        //     int rem = num%10;
        //     if (rem == 5){
        //         count++;
        //     }
        //     num=num/10;
        // }
        // System.out.println(count);

        int num =12345;

        // while(num>0){
        //     int rem = num%10;
        //     int n = rem; 
        //     n = n + rem;     // this is what iam trying to do 
        // }

        int ans = 0 ;

        while ( num >0){
            int rem = num %10;
            num /=10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);

    }
}
