public class shadowing {
    static int x = 100; // this is shadowed in line 6

    public static void main(String[] args) {
        System.out.println(x); // this wil print 100
        int x = 40;
        System.out.println(x); // this will print 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
