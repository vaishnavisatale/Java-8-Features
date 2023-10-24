package Function;

import java.util.function.Function;

public class Test {

    public static void main(String[] args)
    {
        Function<String,Integer> f=s->s.length();
        System.out.println(f.apply("Santosh"));

        Function<Integer,Integer> f1=s->s*s;
        System.out.println(f1.apply(4));

        Function<String,String> f2=s->s.replace('a','b');
        System.out.println(f2.apply("aaaSbbb"));
    }
}
