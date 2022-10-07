package functionalInterface;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Consumers {

    public static void main(String[] args) {


        Consumer con =(consume) -> System.out.println("Hii" + consume);
        con.accept(10);


        Consumer consumer =(consume)->{
            System.out.println("Printing city as : " + consume);
        };
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(consumer);

    }
}
