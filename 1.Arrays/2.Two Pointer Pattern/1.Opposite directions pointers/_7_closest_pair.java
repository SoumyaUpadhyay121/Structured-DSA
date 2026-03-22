import java.util.Scanner;

public class _7_closest_pair {
    public static void main(String[] args) {
            // Description
            // Find the closest pair whose sum is nearest to the target.
            // Sample Input
            // 5
            // 1 4 6 8 10
            // 13
            // Sample Output
            // 4 8
            // Hint
            // Track minimum difference between target and current sum.
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int tar=sc.nextInt();

            int min=Integer.MAX_VALUE;
            int a=0,b=0,i=0,j=n-1;
            while(i<j){
                int sum=(arr[i]+arr[j]);
                int diff=Math.abs(tar-sum);
                if(min>diff){
                    min=diff;
                    a=arr[i];
                    b=arr[j];
                }
                if(sum<tar){
                    i++;
                }
                else{
                    j--;
                }
            }
            System.out.print(a+" "+b);
    }
}
