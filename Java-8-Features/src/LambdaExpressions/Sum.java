package LambdaExpressions;

interface sumI
{
    public void add(int a,int b);
}
public class Sum {

    public static void main(String[] args)
    {
        sumI s=(a,b)->System.out.println("Addistion : "+(a+b));
        s.add(1,2);
    }
}
