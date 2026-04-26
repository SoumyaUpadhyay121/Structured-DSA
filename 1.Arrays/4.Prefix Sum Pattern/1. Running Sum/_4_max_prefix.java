import java.util.Scanner;

public class _4_max_prefix {
    public static void main(String[] args) {
            // Description
            // Find the maximum prefix sum.
            // Sample Input
            // 5
            // 2 -1 4 -2 3
            // Sample Output
            // 6
            // Hint
            // Track the largest running sum.
               Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            int prefix[]=new int[n];
            prefix[0]=arr[0];
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+arr[i];
                max=Math.max(max,prefix[i-1]);
            }
            max=Math.max(max,prefix[n-1]);
            System.out.println(max);
    }
}
