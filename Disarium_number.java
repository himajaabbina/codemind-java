import java.util.*;
import java.io.*;
public class Disarium{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,d=0;
        while(temp>0)
        {d++;temp/=10;}
        double r=0;
        temp=n;
        while(temp>0)
        {
            r+=Math.pow(temp%10,d);
            temp/=10;
            d--;
        }
        r=(int)r;
        if(n==r){
            System.out.println("True");
        }
        else{
            System.out.println("False");        
        }
    }
}