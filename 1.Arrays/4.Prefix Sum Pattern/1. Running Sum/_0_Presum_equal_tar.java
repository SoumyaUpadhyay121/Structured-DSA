import java.util.Scanner;

public class _0_Presum_equal_tar {
    public static void main(String[] args) {
        // Question 3
        // Description
        // Determine whether there exists a prefix whose sum equals a given target.
        // Sample Input
        // 5
        // 2 4 6 3 1
        // 12
        // Sample Output
        // Yes
        // Hint
        // Check prefix sum at each index.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int prefix[]=new int[n];
        boolean flag=false;
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[i-1]==tar){
                System.out.println("Yes");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("NO");
        }

    }
}
