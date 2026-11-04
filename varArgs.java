import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        demo("rish", "rishi");
        demo(3, 4, 4, 3);
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
