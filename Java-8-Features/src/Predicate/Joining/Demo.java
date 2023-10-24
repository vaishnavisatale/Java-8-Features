package Predicate.Joining;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args)
    {
        Predicate<Integer> p1=i->i%2==0;
        Predicate<Integer> p2=i->i>3;

        System.out.println(p1.or(p2).test(5));
        System.out.println(p1.and(p2).test(4));
        System.out.println(p1.negate().test(4));


    }
}
