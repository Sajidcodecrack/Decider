import java.util.*;
import java.lang.*;
public class Occur {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      int[]num = new int [101];
      int i;
      for( i=0;i<101;i++)
      {
        num[i]=0;
      }
      while(true)
      {
        int n= sc.nextInt();
        if(n==0)
        {
            break;
        }
        num[n]++;
      }
      for(i=1;i<101;i++)
      {
        if(num[i]>0)
        {
            System.out.println( i+ " Occurs " + num[i] + " times ");
        }
      }

    }
}
