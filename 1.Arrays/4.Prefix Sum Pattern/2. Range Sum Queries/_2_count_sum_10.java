import java.util.Scanner;

public class _2_count_sum_10 {
    public static void main(String[] args) {
        // Description
        // Count how many queries produce a sum greater than a target value.
        // Sample Input
        // 5
        // 1 3 5 7 9
        // 3
        // 0 2
        // 1 3
        // 2 4
        // 10
        // Sample Output
        // 2
        // Hint
        // Evaluate each query using prefix sums.
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
        int c=0;
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
             if(l == 0 && prefix[r]>10){
                c++;
            } else if((prefix[r] - prefix[l - 1])>10){
                c++;
            }
        }
        System.out.println(c);
    }
}
