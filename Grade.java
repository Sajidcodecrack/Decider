import java.util.*;
import java.lang.*;
public class Grade {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the students number for gradding :");
        int size= obj.nextInt();
        int num[]= new int[size];
        int i;
        System.out.println("Please input the grades of the students :");
        for( i=0;i<size;i++)
        {
            num[i]=obj.nextInt();
           
        }
        System.out.println("Analyzing the mark from our grading system :");
        for(i=0;i<size;i++)
        {
            if(num[i]>=80 && num[i]<=100)
            {
                System.out.println(" Student: " + i + "  A+ "  +num[i]);
            }
            else if(num[i]>=70 && num[i]<=80)
            {
                System.out.println(" Student: " + i + "  A- "  +num[i]);
            }
            else if(num[i]>=60 && num[i]<=70)
            {
                System.out.println(" Student: " + i + "  B+ "  +num[i]);
            }
            else if(num[i]>=50 && num[i]<=60)
            {
                System.out.println(" Student: " + i + "  B- "  +num[i]);
            }
            else if(num[i]>=40 && num[i]<=50)
            {
                System.out.println(" Student : "+ i + "  C- " +num[i]);
            }
            else if(num[i]>=35 && num[i]<=39)
            {
                System.out.println(" Student : "+ i + "  D "  +num[i]);
            }
            else
            {
                System.out.println(" Student : " + i + " Fail " +num[i]);
            }
        }

    }
}
