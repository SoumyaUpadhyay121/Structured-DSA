import java.util.Scanner;

public class _6_product_equal {
    public static void main(String[] args) {
        // Description
        // Determine whether an array contains a pair whose product equals target.
        // Sample Input
        // 5
        // 1 2 3 4 6
        // 12
        // Sample Output
        // Yes
        // Hint
        // Multiply values at both pointers.

         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int tar=sc.nextInt();
            boolean flag=false;
             for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] * arr[j] == tar){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }

        System.out.print(flag ? "Yes" : "No");
    }
    
}
