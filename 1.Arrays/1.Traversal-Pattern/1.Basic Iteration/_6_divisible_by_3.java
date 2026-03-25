import java.util.Scanner;

public class _6_divisible_by_3 {
    public static void main(String[] args) {
        // Description
        // Count how many numbers are divisible by 3.
        // Sample Input
        // 5
        // 3 7 9 12 10
        // Sample Output
        // 3
        // Hint
        // Use arr[i] % 3 == 0.

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++){
                if(arr[i]%3==0){
                    c++;
                }
            }
            System.out.print(c);
            
    }
}
