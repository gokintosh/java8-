package csp.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{



    public static void main(String[] args) {

        Consumer<Integer>print=(t)-> System.out.println("Printing "+t);
//        consumer.accept(10);


        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7);

        numbers.stream().forEach(print);
    }
}
