import java.util.Scanner;

public class _5_diff_equal_tar {
    public static void main(String[] args) {
            // Description
            // Find two numbers whose difference equals a given value.
            // Sample Input
            // 5
            // 1 3 5 8 10
            // 2
            // Sample Output
            // 1 3
            // Hint
            // Compare absolute difference between elements.

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int tar=sc.nextInt();
            for(int i = 0; i < n; i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i] - arr[j]) == tar){
                    System.out.print(arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
    }
}
