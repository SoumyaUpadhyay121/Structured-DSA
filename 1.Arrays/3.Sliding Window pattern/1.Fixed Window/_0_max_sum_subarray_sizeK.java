import java.util.Scanner;

public class _0_max_sum_subarray_sizeK {
    public static void main(String[] args) {
        // Description
        // Find the maximum sum of a subarray of size k.
        // Sample Input
        // 6
        // 2 1 5 1 3 2
        // 3
        // Sample Output
        // 9
        // Hint
        // Compute the first window sum, then subtract the outgoing element and add the incoming one.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int max=sum;
       for(int i = k; i < n; i++){
            sum += arr[i];       // add next element
            sum -= arr[i - k];   // remove previous element

            max = Math.max(max, sum);
        }
        System.out.println(max);

    }
}
