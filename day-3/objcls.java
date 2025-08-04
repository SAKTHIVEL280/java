import java.util.*;

class Calculator{
    public int add(int a,int b)
    {
        return a+b;
    }
}
public class objcls {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator c = new Calculator();

        System.out.println(c.add(a,b));
        sc.close();
    }
}
