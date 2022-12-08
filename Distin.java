import java.util.*;
import java.lang.*;
public class Distin {
    public static boolean Isdistinct ( int num , int a[])
    {
        boolean flag= true;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]== num)
            {
                flag = false;
                break;
            }
         return flag;
        }
    }
   public static void main(String[] args )
   {
     Scanner sc= new Scanner(System.in);
     int [] num = new int [10];
     int k=0;
     for(int i=0;i<10;i++)
     {
        int t= sc.nextInt();
        if(Isdistinct(t,num))
        {
            num[k++]=t;

        }
     }
     for(int i =0;i<k;i++)
     {
        System.out.println("Numbers : " +num[i]);
     }


   
}
}
