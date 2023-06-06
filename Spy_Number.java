import java.util.*;
public class Spy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,product=1,digit;
        while(n>0){
            digit=n%10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        if(sum==product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}