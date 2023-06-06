import java.util.*;
public class SimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p,t;
        int r,result;
        p = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextInt();
        result = (p*t*r)/100;
        System.out.println(result);
    }
}