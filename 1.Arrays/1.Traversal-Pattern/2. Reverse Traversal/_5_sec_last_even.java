import java.util.Scanner;

public class _5_sec_last_even {
    public static void main(String[] args) {
        // Description
        // Find the second last even number in the array.
        // Sample Input
        // 6
        // 3 8 5 6 9 4
        // Sample Output

        // 6
        // Hint
        // Count even numbers during reverse traversal.
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=n-1;i>=0;i--){
             if(arr[i]%2==0){
                c++;
                if(c==2){
                    System.out.println(arr[i]);
                    break;
                }
             }
        }
    }
}
