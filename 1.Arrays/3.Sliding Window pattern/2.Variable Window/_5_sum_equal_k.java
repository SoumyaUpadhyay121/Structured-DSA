import java.util.*;

public class _5_sum_equal_k {
    public static void main(String[] args) {
            // Description
            // Count the number of subarrays with sum equal to k.
            // Sample Input
            // 5
            // 1 2 1 2 1
            // 3
            // Sample Output
            // 4
            // Hint
            // Adjust window size based on sum.
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int count=0,preSum=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,1);
            for(int i=0;i<n;i++){
                preSum+=arr[i];
                int remove=preSum-k;
                if(map.containsKey(remove)){
                    count+=map.get(remove);
                }
                map.put(preSum,map.getOrDefault(preSum, 0)+1);
            }
            System.out.println(count);
            

    }
}
