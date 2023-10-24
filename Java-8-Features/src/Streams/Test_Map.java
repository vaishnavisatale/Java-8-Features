package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_Map {
    public static void main(String[] args) {
         Map<Integer,String> m=new HashMap<>();
         m.put(1,"Santosh");
         m.put(4,"Satale");
         m.put(3,"Java");
         m.put(5,"vaishu");
         m.put(2,"vs");
        System.out.println(m);


        //entry set
        Set<Map.Entry<Integer, String>> a=m.entrySet();
        System.out.println(a);

        //get keys and values

        Set<Integer> b=m.keySet();
        System.out.println(b);

        Collection<String> c=m.values();
        System.out.println(c);

        //
        Stream<Object> d=m.entrySet().stream().filter(i->i.getValue().equals("vs")).map(Map.Entry::getKey);
        System.out.println(d);

        //compare by value
        m.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue()).forEach(System.out::println);
        //Map.Entry<String, Integer> m1=m.entrySet().stream().filter(i->i.getKey()==2).collect(Coll);
        //
    }
}
