import java.util.Scanner;

public class _1_specific_value {
    public static void main(String[] args) {
        // Description
        // Remove all occurrences of a specific value from the array.
        // Sample Input
        // 6
        // 3 2 2 3 4 2
        // 2

        // Sample Output
        // 3 3 4
        // Hint
        // Use two pointers to overwrite unwanted elements.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int tar=sc.nextInt();
        int idx=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=tar){
                arr[idx]=arr[j];
                idx++;
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
