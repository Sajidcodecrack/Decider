import java.util.*;
import java.lang.*;

public class Lab3p{
    
    public static boolean IsDistinct(int num, int[] array){
        boolean flag = true;
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] counter = new int[101];
//        int[] number = new int[1000];
//        for(int i = 0; i<101; i++){
//            counter[i] = 0;
//        }
//        while(true){
//            int n = input.nextInt();
//            if(n==0)
//                break;
//            counter[n]++;
//        }
//        for(int i = 1; i<101; i++){
//            if(counter[i]>0)
//                System.out.println(i+" occurs "+ counter[i] + " times");
//        }
        
        int[] number = new int[10];
        int k = 0;
        for(int i = 0; i<10; i++){
            int temp = input.nextInt();
            if(IsDistinct(temp, number))
                number[k++] = temp;
        }
        for(int i = 0; i<k; i++){
            System.out.print(number[i] + " ");
        }
    }
}