import java.util.Arrays;
import java.util.function.IntConsumer;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

/**
 * Created by johndoe on 11.10.17.
 */
public class Hello {
    public static String hello() {
        return "Hello!";
    }
    public static String helloAge(int age) {
        if (age <= 0) {
throw new IllegalArgumentException();
        }
        return String.format("Hello, %d!", age);
    }

    public static void test1() {
        Arrays.stream(new int[]{1,2,3}).forEach(System.out::println);
    }

    public static void main(String[] args) {
        test1();
        test1();
    }
}
