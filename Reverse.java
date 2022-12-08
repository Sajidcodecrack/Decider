import java.util.*;
import java.lang.*;
public class Reverse {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int size,i;
       System.out.println("Enter size:");
       size= sc.nextInt();
       int num[]= new int [size];
       System.out.println("Enter numbers: ");
       for(i=0;i<size;i++)
       {
        num[i]=sc.nextInt();
       }
       System.out.println("Showing the outputs of thr following inputs:");
       for(i=0;i<size;i++)
       {
        System.out.println(num[i]);
       }
       System.out.println("Outputs in their reverse order :");
       for(i=size-1;i>=0;i--)
       {
        System.out.println(num[i]);
       }
    }
}
