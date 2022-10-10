package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predictFI  {
    public static void main(String[] args) {

        //check if no is odd or even
        Predicate<Integer> predicate  = (val) -> val % 2==0 ;
        System.out.println(predicate.test(5));

        //names start with s or not
        List<String> arrayList=Arrays.asList("Sonakshi" , "Sam" ,"Bhavika","Varun");

        Predicate<String> predicate1=(str) -> str.startsWith("S");
        arrayList.stream().filter(predicate1).forEach(System.out::println);


        Predicate<Integer> predicate2 = (val) -> (val>10);
        System.out.println(predicate2.test(10));

        Predicate<String> predicate3 = (str)->str.length()>4;
        System.out.println(predicate3.test("Sonakshi"));

    }

}
