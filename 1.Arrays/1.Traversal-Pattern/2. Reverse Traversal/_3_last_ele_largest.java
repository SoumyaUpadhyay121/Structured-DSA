import java.util.Scanner;

public class _3_last_ele_largest {
    public static void main(String[] args) {
        // Description
        // Check whether the last element is the largest in the array.
        // Sample Input
        // 5
        // 3 5 8 6 10
        // Sample Output
        // Yes
        // Hint
        // Compare last element with all others.
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String ans="Yes";
        for(int i=0;i<n;i++){
             if(arr[i]>arr[n-1]){
                ans="NO";
             }
        }
        System.out.println(ans);
    }
}
