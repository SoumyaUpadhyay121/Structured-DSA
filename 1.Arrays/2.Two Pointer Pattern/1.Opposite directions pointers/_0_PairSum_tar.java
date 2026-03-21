import java.util.Scanner;

public class _0_PairSum_tar{
    public static void main(String[] args) {
        // Description
        // Find and print the pair of numbers whose sum equals the target in a sorted array.
        // Sample Input
        // 5
        // 2 4 6 8 10
        // 12
        // Sample Output
        // 2 10
        // Hint
        // If sum is greater than target move the right pointer left.

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int i=0,j=n-1,a=0,b=0;
        while(i<j){
            if((arr[i]+arr[j])==tar){
                a=arr[i];
                b=arr[j];
                break;
            }
            else if((arr[i]+arr[j])>tar){
                j--;
            }
            else{
                i++;
            }

        }
        System.out.print(a+" "+b);
        
    }

}
