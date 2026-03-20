import java.util.Scanner;

public class _8_equal_ele {
    public static void main(String[] args) {
        // Description
        // Check if any pair has equal elements.
        // Sample Input
        // 5
        // 2 4 6 2 8
        // Sample Output
        // Yes
        // Hint
        // Compare each pair.
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String ans="NO";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    ans="YES";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
