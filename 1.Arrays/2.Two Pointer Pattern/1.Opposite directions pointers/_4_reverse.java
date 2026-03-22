import java.util.Scanner;

public class _4_reverse {
    public static void main(String[] args) {
        // Description
        // Reverse an array using the two pointer approach.
        // Sample Input
        // 5
        // 1 2 3 4 5
        // Sample Output
        // 5 4 3 2 1

        // Hint
        // Swap elements at both pointers then move inward.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
