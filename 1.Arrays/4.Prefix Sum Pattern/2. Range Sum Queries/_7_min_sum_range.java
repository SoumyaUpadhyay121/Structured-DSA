import java.util.Scanner;

public class _7_min_sum_range {
    public static void main(String[] args) {
        //  Description
        // Find the range with minimum sum among given queries.
        // Sample Input
        // 5
        // 5 4 3 2 1
        // 2
        // 0 2
        // 2 4
        // Sample Output
        // 6
        // Hint
        // Compare range sums.
         Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int q=sc.nextInt();
        int min=Integer.MAX_VALUE;

        while(q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();

            int sum=0;

            for(int i=l;i<=r;i++){
                sum+=arr[i];
            }

            min=Math.min(min,sum);
        }

        System.out.println(min);
    }
}
