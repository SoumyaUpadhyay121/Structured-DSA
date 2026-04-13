import java.util.*;

public class _7_atmost_2_distinct {
    public static void main(String[] args) {
        // Description
        // Find the longest subarray with at most two distinct elements.
        // Sample Input
        // 8
        // 1 2 1 3 4 3 5 1
        // Sample Output
        // 3
        // Hint
        // Shrink window when distinct elements exceed two.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        int l=0,r=0,maxLen=0;
        while(r<n){
            set.add(arr[r]);
            if(set.size()>2){
                set.remove(arr[l]);
                l++;
            }
            if(set.size()<2){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        System.out.println(maxLen);
    }

}
