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


    }

}
