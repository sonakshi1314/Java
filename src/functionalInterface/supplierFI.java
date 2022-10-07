package functionalInterface;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class supplierFI  {
    public static void main(String[] args) {

        Supplier<Double> supplier=()->Math.random();
        DoubleSupplier supplier1=Math::random;
        System.out.println(supplier.get());
        System.out.println(supplier1.getAsDouble());

    }

}
