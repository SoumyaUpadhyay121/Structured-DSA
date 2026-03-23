import java.util.*;

public class _4_first_repeat_ele {
    public static void main(String[] args) {
        // Description
        // Find the first repeating element in the array.
        // Sample Input
        // 6
        // 4 5 6 4 7 8
        // Sample Output
        // 4
        // Hint
        // Track elements seen so far.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }
}
