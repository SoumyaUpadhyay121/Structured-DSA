import java.util.Scanner;

public class _6_sum_div_3 {
    public static void main(String[] args) {
        // Description
        // Count pairs where the sum is divisible by 3.
        // Sample Input
        // 5
        // 1 2 3 4 5
        // Sample Output
        // 4
        // Hint
        // Check (arr[i] + arr[j]) % 3 == 0 .

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%3==0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    
}
 