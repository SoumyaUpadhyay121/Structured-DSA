import java.util.Scanner;

public class _6_product {
    public static void main(String[] args) {
            // Description
            // Find the subarray of size k with the highest product.
            // Sample Input
            // 5
            // 1 2 3 4 5
            // 2
            // Sample Output

            // 20
            // Hint
            // Multiply numbers in the window and update product when sliding.
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int pro=1;
        for(int i=0;i<k;i++){
            pro*=arr[i];
        }

        int max=pro;
       for(int i = k; i < n; i++){
            pro *= arr[i];       
            pro /= arr[i - k]; 

            max = Math.max(max, pro);
        }
        System.out.println(max);

    }
}
