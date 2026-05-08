import java.util.Scanner;

public class _4_average{
    public static void main(String[] args) {
            // Description
            // Find the average value of elements in a given range.
            // Sample Input
            // 5
            // 10 20 30 40 50
            // 1 3
            // Sample Output
            // 30
            // Hint
            // Average = range sum / number of elements.
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int r=sc.nextInt();
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        int c=r-l+1;
        System.out.println(sum/c);
    }
}