import java.util.HashMap;
import java.util.Scanner;

public class _9_subarray_sum_k {
    public static void main(String[] args) {
            // Description
            // Find the longest subarray with sum exactly k.
            // Sample Input
            // 6
            // 1 2 3 1 1 1
            // 3
            // Sample Output
            // 2
            // Hint
            // Expand window while sum ≤ k and shrink if exceeded.
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);//sum,idx
            int sum = 0, maxLen = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i];//cal sum
                if(map.containsKey(sum - k)){//find sum-k and cal len
                    int len = i - map.get(sum - k);
                    maxLen = Math.max(maxLen, len);
                }
                if(!map.containsKey(sum)){//add the preSum and idx
                    map.put(sum, i);
                }
            }

            System.out.println(maxLen);
    }
}
