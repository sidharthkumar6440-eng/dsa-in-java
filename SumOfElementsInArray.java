public class SumOfElementsInArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum+=arr[i];

        }
        System.out.println(sum);
    }
    
}
