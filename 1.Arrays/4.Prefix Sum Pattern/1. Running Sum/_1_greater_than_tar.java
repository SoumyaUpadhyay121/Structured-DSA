import java.util.Scanner;

public class _1_greater_than_tar {
    public static void main(String[] args) {
        // Description
        // Find the index where prefix sum becomes greater than a given value.
        // Sample Input
        // 6
        // 1 2 3 4 5 6
        // 7
        // Sample Output
        // 3
        // Hint
        // Track cumulative sum until it exceeds the target.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[i-1]>tar){
                System.out.println(i-1);
                break;
            }
        }
        
    }
}
