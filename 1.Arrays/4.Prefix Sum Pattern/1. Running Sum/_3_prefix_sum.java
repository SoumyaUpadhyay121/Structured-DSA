import java.util.Scanner;

public class _3_prefix_sum {
    public static void main(String[] args) {
        // Description
        // Find the total sum of all prefixes.
        // Sample Input
        // 4
        // 1 2 3 4
        // Sample Output
        // 20
        // Hint
        // Add each prefix sum to a total variable.
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            int prefix[]=new int[n];
            prefix[0]=arr[0];
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+arr[i];
                sum+=prefix[i-1];
            }
            System.out.println(sum+prefix[n-1]);
    }
}
