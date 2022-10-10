package streamAPI;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id ;
    String name ;
    double price ;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
public class filterApi {
    public static void main(String[] args) {
        ArrayList<Product> productList=new ArrayList<Product>();

        productList.add(new Product(1 , "HP Laptop" , 40000.0));
        productList.add(new Product(2 , "Dell Laptop" , 120000.0));
        productList.add(new Product(3 , "Lenovo Laptop" , 150000.0));
        productList.add(new Product(4 , "Mac Laptop" , 190000.0));

        //filter
        productList.stream().filter(product -> product.price >120000).forEach(product -> System.out.println(product.name + " "+product.price));

        //map
        productList.stream().map(product -> product.price*3).forEach(System.out::println);

    }
}
