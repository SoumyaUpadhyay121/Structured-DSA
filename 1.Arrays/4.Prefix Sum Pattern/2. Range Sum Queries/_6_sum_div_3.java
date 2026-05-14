import java.util.Scanner;

public class _6_sum_div_3{
    public static void main(String[] args) {
        // Description
        // Count ranges where the sum is divisible by 3.
        // Sample Input
        // 5
        // 3 1 2 6 4
        // 2
        // 0 2
        // 2 4
        // Sample Output
        // 1
        // Hint
        // Check modulo condition.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while(q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=0;
            for(int i=l;i<=r;i++){
                sum+=arr[i];
            }
            if(sum%3==0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}