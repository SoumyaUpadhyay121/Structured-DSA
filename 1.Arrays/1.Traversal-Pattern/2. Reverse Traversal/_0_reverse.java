import java.util.Scanner;

public class _0_reverse {
    public static void main(String[] args) {
        // Description
        // Print the elements of an array in reverse order.
        // Sample Input
        // 5
        // 1 2 3 4 5
        // Sample Output
        // 5 4 3 2 1
        // Hint
        // Start loop from n-1 down to 0 .
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
