import java.util.Scanner;

public class _2_even_num {
    public static void main(String[] args) {
        //Question 4
        // Description
        // Count how many even numbers are present in the array.
        // Sample Input
        // 5
        // 2 7 4 9 6
        // Sample Output
        // 3
        // Hint
        // Check 
        // arr[i] % 2 == 0

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                c++;
            }
        }
        System.out.println(c);
    }
}
