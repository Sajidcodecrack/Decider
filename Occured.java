import java.util.*;
import java.lang.*;
public class Occured {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[] num= new int[101];
        int i;
        int n;
        System.out.println("Enter number: ");
     
        for(i=0;i<101;i++)
        {
            num[i]=0;
        }

        while(true)
        {
          n=sc.nextInt();
          if(n==0)
          {
            break;
          }
          num[n]++;
        }
        for(i=0;i<101;i++)
        {
            if(num[i]>0)
        {
            System.out.println(i+ "  Occures : " +num[i] + "times");
        }

    }
}
}

