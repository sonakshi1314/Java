package lambdaExpression;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //using lambda expression

        //with no args
        Vehicle fourWheeler =  () ->  "4w"  ;
        System.out.println(fourWheeler.typeOfVehicle());

        //with args
        Addition add = ( first, second) -> first+second;
        System.out.println(add.sum( 3 , 4));

        //with thread


        Runnable runnable = () -> {
          for(int i=1 ; i<5;i++) {
              System.out.println("value of first thread  is " + i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Runnable runnable1 = () -> {
            for(int i=1 ; i<5;i++) {
                System.out.println("value of second thread  is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
//        runnable.run();

        //firstThread
        Thread thread=new Thread(runnable);
        thread.start();

        //secondThread
        Thread thread1=new Thread(runnable1);
        thread1.start();
    }

}
