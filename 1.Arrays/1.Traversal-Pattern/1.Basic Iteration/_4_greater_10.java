import java.util.Scanner;

public class _4_greater_10 {
    public static void main(String[] args) {
        //Description:Count how many elements are greater than 10.
        // Sample Input
        // 6
        // 5 12 18 7 3 20
        // Sample Output
        // 3
        // Hint
        // Use condition arr[i] > 10
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++){
                if(arr[i]>10){
                    c++;
                }
            }
            System.out.println(c);
        
        
        }
}
