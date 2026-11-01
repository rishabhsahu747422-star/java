public class overloading {
    public static void main(String[] args) {
        fun("rish");
        fun(3);
        fun(3, 4, 5);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int a, int b, int c) {
        System.out.println("sum of a+b+c= " + (a + b + c));
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
