import java.util.Scanner;

public class _1_Unique_ele {
    public static void main(String[] args) {
        // Description:Remove duplicate elements from a sorted array and print the unique values.
        // Sample Input
        // 7
        // 1 1 2 2 3 4 4
        // Sample Output
        // 1 2 3 4
        // Hint
        // Compare elements while moving pointers inward.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        if(n>0){
            System.out.print(arr[n-1]);
        }
    }
}
