import java.util.Scanner;

public class _7_one_negative {
    public static void main(String[] args) {
        // Description
        // Find how many windows of size k contain at least one negative number.
        // Sample Input
        // 6
        // 2 -3 4 5 -1 6
        // 3
        // Sample Output
        // 3
        // Hint
        // Check presence of negative numbers in each window.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
