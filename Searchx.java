import java.lang.*;
import java.util.*;
public class Searchx {
    public static void main(String[] args){
        
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter array size:");
       int size= sc.nextInt();
       int [] num= new int[size];
        
       System.out.println("Taking inputs from user :");
       for(int i= 0;i<num.length;i++)
       {
         num[i]= sc.nextInt();
         
       }
       System.out.println("Searching number :");
       int x = sc.nextInt();
       

      
       //System.out.println("Displaying the number :");
       for(int i=0;i<num.length;i++)
       {
        //System.out.println(num[i]);
        if(num[i]==x)
        {
            System.out.println("Index number : " +i);
        }

       
       }
       
    }
}
