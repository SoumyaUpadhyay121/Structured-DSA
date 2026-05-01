import java.util.Scanner;

public class _3_sum_even_odd {
    public static void main(String[] args) {
            // Description
            // Check whether the sum of elements between two indices is even or odd.
            // Sample Input
            // 5
            // 2 4 6 3 5
            // 1 3
            // Sample Output
            // Odd
            // Hint
            // Compute range sum then check parity.

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
        int l=sc.nextInt();
        int r=sc.nextInt();
        if((prefix[r] - prefix[l - 1])%2==0){
            System.out.println("Even");
        } 
        else {
            System.out.println("Odd");
        }
        }
    
}
