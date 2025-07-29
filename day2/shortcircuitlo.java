public class shortcircuitlo {
    public static void main(String[]args)
    {
        int n = 1;
        int m = 2;
        
        float x = 12.2f;
        float y = 14.4f;

        if((n < m) | (x > y) )   //what it does even tho the first one is true it will check for the other one it is slow 
        {
            System.out.println("true");
        }
        
        if((n < m) || (x > y) )   //what it does first one is true so it is true so it will skip the second one 
        {
            System.out.println("true");
        }

    }
}
