import java.util.Arrays;
import java.util.Scanner;

public class _8_replace_k_char {
    public static void main(String[] args) {
        // Description
        // Find the maximum length substring where you can replace at most k characters to make
        // all characters same.
        // Sample Input
        // AABABBA
        // 1
        // Sample Output
        // 4
        // Hint
        // Track most frequent character in window.
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int l=0,r=0,freq=0,maxLen=0;
        int []hash=new int[26];
        Arrays.fill(hash, 0);
        while(r<s.length()){
            char ch=s.charAt(r);
            hash[ch-'A']++;
            freq=Math.max(freq,hash[ch-'A']);
            if((r-l+1)-freq>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-freq<=k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}
