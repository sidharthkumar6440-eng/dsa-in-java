public class MultiplicationsOfElementsInArrays {
    public static void main(String[] args) {
        int arr[]={2,3,10,20};
        int n=arr.length;
        int multiplication=1;
        for(int i=0;i<=n-1;i++){
            multiplication*=arr[i];
          

        }
          System.out.println(multiplication);
    }
    
}
