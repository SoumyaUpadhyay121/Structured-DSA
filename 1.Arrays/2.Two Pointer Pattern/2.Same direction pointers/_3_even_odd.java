import java.util.Scanner;

public class _3_even_odd {
    public static void main(String[] args) {
            // Description
            // Separate even and odd numbers, placing evens first.
            // Sample Input
            // 6
            // 1 2 3 4 5 6
            // Sample Output
            // 2 4 6 1 3 5
            // Hint
            // Use two pointers to swap positions.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       int[] result = new int[n];
        int index = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                result[index++] = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                result[index++] = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }
}
