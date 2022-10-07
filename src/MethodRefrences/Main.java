package MethodRefrences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;

//Method reference is used to refer method of functional interface.
public class Main {

    Main(){
        System.out.println("constructor is called");
    }
//    void solve(String str){
//        System.out.println("Instance method called");
//        System.out.println("string is " +str);
//    }
    void solve(){
        System.out.println("Instance method is called");
    }
    static void running(){
        System.out.println("static method called");
    }
    public static void main(String[] args) {

        //using lambda expression
        Function<Integer , Double> function =(val)->Math.sqrt(val);
        System.out.println(function.apply(25));

        //using method refrence
        Function<Integer , Double> function1 =Math::sqrt;
        System.out.println(function1.apply(4));

        // by static method
        Human human=Main::running;
        human.run();

        //by instance method
//        Human human1= new Main()::solve;
//        human1.eat("Hii I am eating");

        Human human1= new Main()::solve;
        human1.run();


        //by constructor
         Human human2 = Main::new;
         human2.run();

         //by instance method : when parameter call its object in lambda func
        String[] str={"A" ,"O ", "U", "E" , "I" ,"a" };

   //     Arrays.sort( str , (o1,o2)-> o1.compareTo(o2));
        Arrays.sort(str , (s1 , s2) -> s1.compareToIgnoreCase(s2));

        for(int i=0;i< str.length;i++)
        System.out.print(str[i]+" ");
     //   Optional
    }
}
