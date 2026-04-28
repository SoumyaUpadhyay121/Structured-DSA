import java.util.Scanner;

public class _0_between_range{
    public static void main(String[] args) {
        // Description
        // Given an array and indices L and R , find the sum of elements between them (inclusive).
        // Sample Input
        // 5
        // 1 2 3 4 5

        // 1 3
        // Sample Output
        // 9
        // Hint
        // Use prefix[R] - prefix[L-1]
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int r=sc.nextInt();
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}