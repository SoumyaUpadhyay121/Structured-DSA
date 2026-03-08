public class _2_Max_ele {
    public static void main(String[] args) {
            //Description
            // Find the maximum element in the array.

            // Sample Input
            // 6
            // 3 8 1 9 4 7
            // Sample Output
            // 9
            // Hint
            // Start with the first element as max and compare it with each next element.
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            for(int ele:arr){
                if(ele>max){
                    max=ele;
                }
            }
            System.out.println(max);
    }
}
