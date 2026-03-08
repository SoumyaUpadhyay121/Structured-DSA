import java.util.Scanner;

public class _1_Sum_of_ele {
    public static void main(String[] args) {
        //Question 2

        // Description
        // Given an array of integers, calculate and print the sum of all elements.

        // Sample Input
        // 5
        // 10 20 30 40 50

        // Sample Output
        // 150

        // Hint
        // Initialize a variable sum = 0 and keep adding each element during iteration.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        System.out.println(sum);
    }
}
