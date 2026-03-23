import java.util.*;

public class _0_zeroes_to_end {
    public static void main(String[] args) {
            // Description
            // Move all zeros to the end of the array while keeping non-zero elements in order.
            // Sample Input
            // 6
            // 0 1 0 3 12 5
            // Sample Output
            // 1 3 12 5 0 0
            // Hint
            // Use one pointer to track placement of non-zero elements.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
