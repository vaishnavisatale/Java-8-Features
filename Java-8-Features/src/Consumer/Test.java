package Consumer;

import javax.swing.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args)
    {
        Consumer<String> c=s->System.out.println(s.toUpperCase());

        c.accept("vaishu");
    }
}
