import java.util.Arrays;
import java.util.Scanner;

public class _3_max_pair_less {
    public static void main(String[] args) {

        // Description
        // Find the maximum pair sum less than or equal to target.
        // Sample Input
        // 5
        // 2 3 5 8 9
        // 10
        // Sample Output
        // 10
        // Hint
        // Adjust pointers depending on sum.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        Arrays.sort(arr);
        int i=0,j=n-1;
        int max=-1;
        while(i<j){
            if((arr[i]+arr[j])<=tar){
                max=Math.max(arr[i]+arr[j],max);
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(max);
    }
}
