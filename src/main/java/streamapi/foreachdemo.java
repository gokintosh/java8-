package streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class foreachdemo {

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Gokul");
        list.add("Rahul");
        list.add("Mehul");
        list.add("Sohul");

        list.stream().forEach((t)-> System.out.println(t));

        list.stream().filter(t->t.startsWith("R")).forEach((t)-> System.out.println(t));


        Map<Integer,String>students=new HashMap<>();
        students.put(1,"Gokul");
        students.put(2,"Rahul");
        students.put(3,"Sohul");

        students.forEach((key,value)-> System.out.println("key :"+key +" and value is "+value));


    }
}
