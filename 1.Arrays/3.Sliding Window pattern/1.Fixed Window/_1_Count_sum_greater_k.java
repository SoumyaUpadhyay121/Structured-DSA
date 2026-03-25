import java.util.Scanner;

public class _1_Count_sum_greater_k {
    public static void main(String[] args) {
        // Description
        // Count how many subarrays of size k have sum greater than a given value.
        // Sample Input
        // 6
        // 1 4 2 10 3 1
        // 3
        // 10
        // Sample Output
        // 2
        // Hint
        // Check window sum after each slide.
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int val=sc.nextInt();
        int sum=0,c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>val) c++;
       for(int i = k; i < n; i++){
            sum += arr[i];       // add next element
            sum -= arr[i - k];   // remove previous element
             if(sum>val) c++;
            
        }
        System.out.println(c);
    }
}
