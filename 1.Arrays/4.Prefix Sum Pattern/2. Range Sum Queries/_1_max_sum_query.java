import java.util.Scanner;

public class _1_max_sum_query {
    public static void main(String[] args) {
            // Description
            // Find the range with the maximum sum among given queries.
            // Sample Input
            // 5
            // 3 2 5 1 6

            // 2
            // 0 2
            // 1 4
            // Sample Output
            // 14
            // Hint
            // Compare sums of all query ranges.
            Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        int t=sc.nextInt();
        int max=Integer.MIN_VALUE;
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
             if(l == 0){
                max=Math.max(max,prefix[r]);
            } else {
                max=Math.max(max,prefix[r] - prefix[l - 1]);
            }
        }
        System.out.println(max);
    }
}
