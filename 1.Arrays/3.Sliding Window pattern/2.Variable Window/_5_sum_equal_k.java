import java.util.Scanner;

public class _5_sum_equal_k {
    public static void main(String[] args) {
            // Description
            // Count the number of subarrays with sum equal to k.
            // Sample Input
            // 5
            // 1 2 1 2 1
            // 3
            // Sample Output
            // 4
            // Hint
            // Adjust window size based on sum.
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int count=0;
            int l=0,r=0,sum=0;
            while(r<n){
                sum+=arr[r];
                if()
            }

    }
}
