import java.util.Scanner;

public class _0_running_sum {
    public static void main(String[] args) {
            // Description
            // Given an array, compute the running sum of its elements.
            // Sample Input
            // 5
            // 1 2 3 4 5
            // Sample Output
            // 1 3 6 10 15
            // Hint
            // Each element in the prefix array equals the current element plus the previous prefix sum.
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
            for (int i = 0; i < prefix.length; i++) {
                System.out.print(prefix[i]+" ");
            }
            
    }
}
