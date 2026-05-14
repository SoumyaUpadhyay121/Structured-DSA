import java.util.Scanner;

public class _5_sum_exceeds_target {
    public static void main(String[] args) {
        // Description
        // Find the smallest range whose sum exceeds a target value.
        // Sample Input
        // 5
        // 2 1 3 4 2
        // 5
        // Sample Output
        // 2
        // Hint
        // Try ranges using prefix sums.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int sum=0;

            for(int j=i;j<n;j++){
                sum+=arr[j];

                if(sum>target){
                    min=Math.min(min,j-i+1);
                    break;
                }
            }
        }

        System.out.println(min);
    }
}
