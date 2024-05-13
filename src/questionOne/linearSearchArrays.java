package questionOne;
import java.util.Scanner;
public class linearSearchArrays {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int count = 0;
        int target;
        int[] arrayNumbs;
        arrayNumbs = new int[5];
        System.out.println("Enter target:");
        target = sc.nextInt();
        for(int i= 0; i<arrayNumbs.length;i++){
            System.out.println("Enter array elements:");
            arrayNumbs[i] = sc.nextInt();
        }
        for (int num=0; num<arrayNumbs.length;num++){
            if(arrayNumbs[num]== target){
                count++;
                System.out.println(arrayNumbs[num] + " : " + count);
            }
            else{
                System.out.println("number not found.");
            }
        }
    }
}
