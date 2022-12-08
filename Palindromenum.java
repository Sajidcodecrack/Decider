import java.util.*;
import java.lang.*;
public class Palindromenum {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number :");
        int num,rev=0;
        num= sc.nextInt();
        int i=0;
        int temp;
        temp=num;
        while(num!=0)
        {
            rev= rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number : " +rev);
        if(temp==rev)
        {
            System.out.println("Number is Palendromic ");
        }
        else
        {
            System.out.println("Number is not Palendromic" );
        }
        
    }
}