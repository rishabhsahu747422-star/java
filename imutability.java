import java.util.Arrays;

public class imutability {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        change1(arr);
        System.out.println(Arrays.toString(arr)); /// array got change because it is mutable

        change("sahu"); /// string can't change
    }

    /// that says java only support pass by value not pass by refrence

    static void change(String name) {
        name = "Rishabh";
        System.out.println(name);
    }

    static void change1(int[] nums) {
        nums[0] = 99;
    }

}
