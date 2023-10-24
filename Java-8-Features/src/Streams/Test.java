package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<8;i++)
            l1.add(i);
        System.out.println(l1);
        //Filter
        List<Integer> l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);

        //Map

        List<Integer> l3=l1.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(l3);

        //min and max
        int min=l1.stream().min(Integer::compareTo).get();
        int max=l1.stream().max(Integer::compareTo).get();
        System.out.println(" Min : "+min +" Max : "+max);

        //count
        int c= (int) l1.stream().filter(i->i%2==0).count();
        System.out.println(" Event number count: "+c);

        //reverse order
        List<Integer> l4=l2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(l4);

        List<Integer> l5=new ArrayList<>();
        for(int i=0;i<8;i++)
        {
            l5.add( new Random().nextInt(99));
        }
        System.out.println("----------------------");
        System.out.println(l5);
        List<Integer> l6=l5.stream().sorted().collect(Collectors.toList());
        System.out.println(l6);

        List<Integer> l7=l5.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(l7);

        //Nth highest from list using stream

        //int h=l5.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(3);
        int h=l5.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(3);

        System.out.println(h);


    }
}
