public class Arrays {

    public static void main(String[] args) {

        // Declaration
        int[] arr;

        // Allocation
        arr = new int[5];

        // Initialization
        arr = new int[]{10, 20, 30, 40, 50};

        // Traversing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}