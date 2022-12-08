import java.util.*;
public class GCDh {
    public static void main(String[] args){
       Scanner scm= new Scanner(System.in);
       System.out.println("Enter two numbers from user :");
       int n1= scm.nextInt();
       int n2=scm.nextInt();
       int min;
       int gcd=1;
       if(n1>n2)
       {
        min=n2;

       }
       else
       {
        min=n1;
       }
       for(int i=min;i>1;i--)
       {
        if(n1%i==0 && n2%i==0)
        {
            gcd=i;
            break;
        
        }
       }
System.out.println("Final gcd of those follwoing numbers : "  +gcd);
       

    }
}
