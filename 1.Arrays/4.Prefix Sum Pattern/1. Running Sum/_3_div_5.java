import java.util.Scanner;

public class _3_div_5 {
    public static void main(String[] args) {
            // Description
            // Find the first prefix whose sum is divisible by 5.
            // Sample Input
            // 5
            // 2 3 7 4 1
            // Sample Output
            // 2
            // Hint
            // Check prefix sum modulo condition.
                Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int prefix[]=new int[n];
            prefix[0]=arr[0];
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+arr[i];
                if(prefix[i-1]%5==0){
                    System.out.println(i);
                    break;
                }
            }
            
    }
}
