import java.util.*;
public class oddnum
{  
   public static int findodd(int arr[],int size)
   {
      int count=0;
      for(int i=1;i< size-1;i++)
      {
         if(arr[i]%2 !=0)
         {
             if(arr[i-1]%2==0 && arr[i+1]%2==0)
                    count++;
         }
      }
      return count;
   }
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n,x[];
      n = sc.nextInt();
      x = new int[n];
      for(int i=0;i<n;i++)
      x[i] = sc.nextInt();
      int result=findodd(x,n);
      System.out.println(result);
   }
     
}