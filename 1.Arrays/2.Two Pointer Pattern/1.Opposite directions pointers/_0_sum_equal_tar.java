import java.util.Scanner;

public class _0_sum_equal_tar {
    public static void main(String[] args) {
        // Description
        // Given a sorted array, determine if there exists a pair whose sum equals a target value.
        // Sample Input
        // 6
        // 1 2 3 4 6 8
        // 10
        // Sample Output
        // Yes
        // Hint
        // Use one pointer at the start and one at the end. Move them based on the current sum.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int l=0,r=n-1;
        String ans="NO";
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==tar){
                ans="YES";
                break;
            }
            else if(sum>tar){
                r--;
            }
            else{
                l++;
            }
        }

        System.out.println(ans);
    
    
    }
}
