public class typeconv {
    public static void main(String []args)
    {
        /*int n = 120;
        byte a = 12;
        a=n;
        System.out.println(a);*/
        // this will be an error since int is bigger than byte so it wont allow to convert

        int a = 48;
        byte s = 12;
        a = s; //can be conversed normally 

        int n =12;
        byte b = 11;
        b = (byte)n; // casting
        System.out.println(b); 
    }
}
