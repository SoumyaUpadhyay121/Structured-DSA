import java.util.Scanner;

public class _2_sum_of_last_3 {
    public static void main(String[] args) {
        // Description
        // Calculate the sum of the last three elements using reverse traversal.
        // Sample Input
        // 6
        // 5 10 15 20 25 30
        // Sample Output
        // 75
        // Hint
        // Traverse last 3 positions.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=n-1;i>=n-3;i--){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
