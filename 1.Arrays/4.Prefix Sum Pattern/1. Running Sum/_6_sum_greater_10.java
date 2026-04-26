import java.util.Scanner;

public class _6_sum_greater_10 {
    public static void main(String[] args) {
        // Description
        // Count how many prefixes have sum greater than 10.
        // Sample Input
        // 5
        // 2 4 6 1 3
        // Sample Output
        // 2
        // Hint
        // Track prefix sums during traversal.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        if(prefix[0]>10) c++;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[i]>10){
                c++;
            }
        }
        System.out.println(c);
    }
}
