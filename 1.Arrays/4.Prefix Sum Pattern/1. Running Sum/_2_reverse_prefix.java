import java.util.Scanner;

public class _2_reverse_prefix {
    public static void main(String[] args) {
            // Description
            // Print the running sum in reverse order.
            // Sample Input
            // 4
            // 2 4 6 8
            // Sample Output
            // 20 12 6 2
            // Hint
            // Compute prefix sum first, then print backward.
             Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int prefix[]=new int[n];
            prefix[0]=arr[0];
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+arr[i];
            }
            for (int i = n-1;i>=0; i--) {
                System.out.print(prefix[i]+" ");
            }
    }   
}
