public class _0_len_unique_ele {
    public static void main(String[] args) {
        // Description
        // Remove duplicates from a sorted array and return the length of the unique array.
        // Sample Input
        // 6
        // 1 1 2 2 3 4
        // Sample Output
        // 4
        // Hint
        // Use one pointer for unique placement and another for scanning.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        if(n>0){
            count++;
        }
        System.out.print(count);
    }
}
