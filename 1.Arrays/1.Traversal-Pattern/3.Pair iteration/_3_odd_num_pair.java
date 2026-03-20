import java.util.Scanner;

public class _3_odd_num_pair {
    public static void main(String[] args) {
            // Description: Count pairs where both numbers are odd.
            // Sample Input
            // 5
            // 1 3 4 7 8
            // Sample Output
            // 3
            // Hint
            // Check arr[i] % 2 != 0 and arr[j] % 2 != 0 .

            Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]%2!=0 && arr[j]%2!=0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
