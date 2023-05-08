package block;

public class inheritance {
    public static void main(String[] args) {
        sum(5,6,7);
    }
    static void sum(int a , int b){
        int ans=a+b;
        System.out.println(ans);
    }
    static void sum(int a, int b, int c){
        int ans = a+b+c;
        System.out.println(ans);
    }

}
