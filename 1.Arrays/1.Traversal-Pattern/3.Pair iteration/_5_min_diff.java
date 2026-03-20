import java.util.Scanner;

public class _5_min_diff {
    public static void main(String[] args) {
        // Description
        // Find the pair with minimum difference.
        // Sample Input
        // 4
        // 10 22 15 18
        // Sample Output
        // 15 18
        // Hint
        // Track minimum absolute difference.

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int a=0,b=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]-arr[j])<min){
                    min=Math.min(min,Math.abs(arr[i]-arr[j]));
                    a=arr[i];
                    b=arr[j];
                }
            }
        }
        System.out.println(a+" "+b);
        

    }
    
}
