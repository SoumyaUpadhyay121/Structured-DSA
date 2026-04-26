import java.util.Scanner;

public class _5_negative_prefix {
    public static void main(String[] args) {
            // Description
            // Check if any prefix sum becomes negative.
            // Sample Input

            // 5
            // 3 -5 4 2 1
            // Sample Output
            // Yes
            // Hint
            // Check running sum after each addition.
            Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        boolean flag=false;
        prefix[0]=arr[0];
         if(prefix[0] < 0){
            flag = true;
        }
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[i]<0){
                flag=true;
                break;
            }
        }
       if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
       
    }
}
