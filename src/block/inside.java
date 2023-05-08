package block;

public class inside {
    public static void main(String[] args) {
        {
        int x=20;

        }
        {
           // System.out.println(x);  // This will show error because we are printing x in the block where we have not decarled it.

            int a=45;
            System.out.println(a);  // This will not show error as we have decalred a here itself
        }
    }
}
