package functionalInterface;

import java.util.function.Function;

public class functionalFI {
    public static void main(String[] args) {
        //take a string and return its length

        Function<String, Integer> functionalInterface=(str)->str.length();
        int ans = functionalInterface.apply("sonakshi");
        System.out.println(ans);

    }
}
