import java.util.Scanner;

public class _0_min_sum_sizeK {
    public static void main(String[] args) {
        //  Description
        // Find the minimum sum of any subarray of size k.
        // Sample Input
        // 5
        // 3 7 2 9 1
        // 2
        // Sample Output
        // 8
        // Hint
        // Slide the window and track the smallest sum.
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
        int min=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            min=Math.min(min,sum);
        }
        System.out.println(min);
    }
}
