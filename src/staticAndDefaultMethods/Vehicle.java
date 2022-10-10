package staticAndDefaultMethods;

public interface Vehicle {

    String getcolor();

    default String getBrand() {
        return "brand of vehicle";
    }
    static String getTYpe(){
        return "type of vehicle";
    }

}
