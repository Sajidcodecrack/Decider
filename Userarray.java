import java.util.*;
public class Userarray {
    public static void main(String[] args){
      System.out.println("Enter the size you want to store information:");
      Scanner sc = new Scanner(System.in);
      int size= sc.nextInt();
      int num[]= new int[size];
      
      System.out.println("Taking inputs from user :");
      for(int i =0; i<size;i++)
      {
        num[i]=sc.nextInt();
      }
      System.out.println("System showing the out put to the user :");
      for(int i=0;i<size;i++)
      {
        System.out.println( "Index number" +(i+1) + ":" +num[i]);
      }
    


    
}
}
