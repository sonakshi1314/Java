package staticAndDefaultMethods;

public class Main {

    public static void main(String[] args) {

        //abstract method
        Vehicle vehicle = ()-> "returing the color of vehicle";
     //   Vehicle vehicle =System.out::println; //can we write method reference here??
        System.out.println(vehicle.getcolor());

        //default
        System.out.println(vehicle.getBrand());

        //static(call by interface name)
        System.out.println(Vehicle.getTYpe());

    }
}


