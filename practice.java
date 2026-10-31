

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        // System.out.print("Enter any Number ");
        Scanner input = new Scanner(System.in);

        // int num = input.nextInt();
        // System.out.println("Your number is " + num);

        // String name = input.next();
        // System.out.println(name);
        // System.out.println(input.nextLine());

        // float marks = input.nextFloat();
        // System.out.println(marks);


        //--------------------- loops------------------------//

        // float temp = input.nextFloat();

        // float tempf = (temp*9/5)+32;
        // System.out.println(tempf);

        // int i = 1;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }

        // for (int i =1;i<=5;i++){
        //     System.out.println(i);
        // }



        // System.out.print("Enter any Number ");
        // int n = input.nextInt();
        
        // int i = 1;
        // while(i<=n){
        //     System.out.println(i + ". " + "I am Sorry");
        //     i++;
        // }

        /*
        for (int i = 1 ;i<=n;i++){
            System.out.print(i +". ");
            System.out.println("Sorry");
        }
        */
        
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int c = input.nextInt();

        // int max = a;
        
        // if (b>a){
        //     max=b;
        // }
        // if (c>b){
        //     max = c;
        // }

        // int max = Math.max(a,Math.max(b,c));
        // System.out.println(max);

        char ch =input.next().trim().charAt(0);

        if( ch>= 'a' && ch<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }


        

    }
}
