import java.util.Scanner;

public class _0_pairSum_equal_10 {
    public static void main(String[] args) {
        // Description
        // Count how many pairs have sum equal to 10.
        // Sample Input
        // 5
        // 2 8 4 6 3
        // Sample Output
        // 2
        // Hint
        // Check arr[i] + arr[j] == 10 .

        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==10){
                    c++;
                }
            }
        }
        System.out.println(c);


    }
}
