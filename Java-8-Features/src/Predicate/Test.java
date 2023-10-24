package Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args)
    {
        Predicate<String> p1=s->(s.length()>5);
        System.out.println(p1.test("vaishu"));

        System.out.println("----------------------------------");
        List<Integer> l=new ArrayList<>();

        Predicate<Collection> p2= s1->s1.isEmpty();
        System.out.println(p2.test(l));

        System.out.println("----------------------------------");

        Predicate<Integer> p= i->(i>10);
        System.out.println(p.test(11));
        System.out.println(p.test(1));
        System.out.println(p.test(10));


    }
}
