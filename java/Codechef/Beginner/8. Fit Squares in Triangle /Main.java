import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n =sc.nextInt();
            n-=2;
            n/=2;
            System.out.println( (n*(n+1))/2 );
        }
        sc.close();
    }
}