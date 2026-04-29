import java.util.Scanner;

public class _0_multiply_range_sum {
    public static void main(String[] args) {
        // Description
        // Answer multiple range sum queries.
        // Sample Input
        // 5
        // 1 2 3 4 5
        // 3
        // 0 2
        // 1 4
        // 2 3
        // Sample Output
        // 6
        // 14
        // 7
        // Hint
        // Precompute prefix sums once.
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
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
             if(l == 0){
                System.out.println(prefix[r]);
            } else {
                System.out.println(prefix[r] - prefix[l - 1]);
            }
        }
    }
}
