package csp.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{




    public static void main(String[] args) {

        Predicate<Integer>checkEven=(t)->t%2==0;

//        System.out.println(checkEven.test(7));

        List<Integer>list1= Arrays.asList(1,2,3,4,5);

        list1.stream().filter(checkEven).forEach(t-> System.out.println("Print even"+t));


    }
}
