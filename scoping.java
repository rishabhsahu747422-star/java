public class scoping {
    public static void main(String[] args) {
        int a = 10;
        {
            // int a = 100; // we can't initialise again
            a = 100; // it is re-asigning the original refrence's value
            System.out.println(a);
            int c = 55; // can't be accessible outside the scope
        }
        // System.out.println(c);
        System.out.println(a);
    }
}
