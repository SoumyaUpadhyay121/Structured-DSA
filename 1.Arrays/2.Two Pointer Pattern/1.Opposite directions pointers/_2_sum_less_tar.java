import java.util.*;

public class _2_sum_less_tar {
    public static void main(String[] args) {
        // Description
        // Count how many pairs have a sum less than a given target.
        // Sample Input

        // 5
        // 1 2 3 4 5
        // 6
        // Sample Output
        // 4
        // Hint
        // When sum is less than target, multiple pairs can be counted.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        Arrays.sort(arr);
        int i=0,j=n-1,c=0;
        while(i<j){
            if((arr[i]+arr[j])<tar){
                c+=(j-i);
                i++;
            }
            else{
                j--;
            }

        }
        System.out.print(c);      
    }
}
