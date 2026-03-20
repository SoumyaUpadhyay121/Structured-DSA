import java.util.Scanner;

public class _2_last_middle_idx {
    public static void main(String[] args) {
        // Description
        // Print elements from last index to middle index.
        // Sample Input
        // 6
        // 1 2 3 4 5 6
        // Sample Output
        // 6 5 4
        // Hint
        // Loop until i >= n/2 .
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=n-1;i>=n/2;i--){
             System.out.print(arr[i]+" ");
        }
       
    }
}
