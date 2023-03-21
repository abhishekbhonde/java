package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row =0; row<2 * n; row++){
            int totalcolnum = row >n ? 2 * n - row : row;
            for(int col=0; col<totalcolnum; col++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
