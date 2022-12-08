import java.lang.*;
import java.util.*;
public class Maths {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int pos= 0 , neg= 0;
       int sum= 0;
       int sub=0;
       int mul=1;
       float avg=1;
       
       System.out.println("Enter array size:");
       int size= sc.nextInt();
       int num[]=new int[size];
       int max=0,min=0;
       System.out.println("Taking inputs from the  user :");
       for(int i=0;i<size;i++)
       {
        num[i]=sc.nextInt();
        if(num[i]>0)
        {
            pos++;
        }
        else if (num[i]<0)
        {
            neg++;
        }
        sum=sum+num[i];
        sub=sub-num[i];
        mul=mul*num[i];
         avg = (float)sum/size;
         if(num[i]>max)
         {
            max=num[i];
         }
         else if(num[i]<min)
         {
            min=num[i];
         }
       }


     System.out.println("Positive numbers : " +pos);
     System.out.println("Negative numbers : " +neg);
     System.out.println("Summation of the following numbers : " +sum);
     System.out.println("Subtraction of the following numbers : " +sub);
     System.out.println("Multiplication of the following numbers : " +mul);
     System.out.println("Average of the following : " +avg);
     System.out.println("Highest value from the following value : " +max);
     System.out.println("Minimum value from the following value : " +min);
    }
}
