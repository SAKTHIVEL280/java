public class typepromote {
    public static void main(String[]args)
    {
        byte n = 12;
        byte m = 14;
        //byte res = m * n; since the m*n will be more than the range of byte it will lead to error, but we can store it in int "promoting"
        int res = m * n;
        System.out.println(res);
    }
}
