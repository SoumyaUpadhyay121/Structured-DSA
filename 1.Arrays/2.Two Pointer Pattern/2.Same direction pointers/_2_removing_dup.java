import java.util.Scanner;

public class _2_removing_dup {
    public static void main(String[] args) {
        // Description
        // Compress the array by removing consecutive duplicates.
        // Sample Input
        // 7
        // 1 1 1 2 2 3 3
        // Sample Output
        // 1 2 3
        // Hint
        // Check current and previous elements.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int idx=1;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[j-1]){
                arr[idx]=arr[j];
                idx++;
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
