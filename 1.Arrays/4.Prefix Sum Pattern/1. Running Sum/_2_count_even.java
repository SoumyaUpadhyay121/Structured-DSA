import java.util.Scanner;

public class _2_count_even {
    public static void main(String[] args) {
        // Description
        // Count how many prefix sums are even.
        // Sample Input

        // 5
        // 1 3 2 6 4
        // Sample Output
        // 3
        // Hint
        // Check prefix_sum % 2 == 0
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[i-1]%2==0){
                c++;
            }
        }
        System.out.println(c);
    }
}
