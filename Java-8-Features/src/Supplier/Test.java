package Supplier;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args)
    {
        Supplier<Double> s=()->Math.random();

        System.out.println(s.get());
    }
}
