import java.util.Scanner;

public class _4_diff_2 {
    public static void main(String[] args) {
        // Description
        // Print pairs where difference between numbers is 2.
        // Sample Input
        // 5
        // 1 3 5 7 9
        // Sample Output
        // 1 3
        // 3 5
        // 5 7
        // 7 9
        // Hint
        // Check abs(arr[i] - arr[j]) == 2 .

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]-arr[j])==2){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        
    
    }
}
