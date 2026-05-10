import java.util.Scanner;

public class _4_sum_equal_target {
    public static void main(String[] args) {
        // Description
        // Determine whether the sum of a range equals a target.
        // Sample Input
        // 5
        // 1 2 3 4 5
        // 0 3
        // 10
        // Sample Output

        // Yes
        // Hint
        // Use prefix difference to compute range sum.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int r=sc.nextInt();
        int tar=sc.nextInt();
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        if(sum==tar){
            System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
    }
}
