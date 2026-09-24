import java.util.Scanner;

public class TakingInputInArrays {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int n=arr.length;
        //Input
     
        for(int i=0;i<=n-1;i++){
               System.out.println("Value at index "+ i);
            arr[i]=sc.nextInt();
        }
        //Print
           System.out.println("Your array contains");
        for(int val:arr){
           System.out.println(val);
        }

}
}