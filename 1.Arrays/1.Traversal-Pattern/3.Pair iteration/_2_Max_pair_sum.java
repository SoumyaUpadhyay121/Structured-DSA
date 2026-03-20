import java.util.Scanner;

public class _2_Max_pair_sum {
    public static void main(String[] args) {
        // Description
        // Find the maximum pair sum.
        // Sample Input
        // 4
        // 5 1 7 3
        // Sample Output
        // 12
        // Hint
        // Check sum of every pair.


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[i]+arr[j]);
            }
        }
        System.out.println(max);
        
    
    }
}
