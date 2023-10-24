package LambdaExpressions;
@FunctionalInterface
interface SquareI
{
    public int sq(int x);
}
public class Square {
    public static void main(String[] args)
    {
        SquareI s=a-> a*a;

        System.out.println("Square of 8 : "+s.sq(8));
    }
}
