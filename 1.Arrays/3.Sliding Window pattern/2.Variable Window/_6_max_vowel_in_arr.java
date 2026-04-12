import java.util.*;

public class _6_max_vowel_in_arr {
    public static void main(String[] args) {
        //Description
        // Find the maximum number of vowels in any substring.
        // Sample Input
        // abciiidef
        // 3
        // Sample Output
        // 3
        // Hint
        // Track vowels in current window.
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<s.length();i++){
            if(vowel(s.charAt(i-k))){
                count--;
            }
            if(vowel(s.charAt(i))){
                count++;
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
    }
    public static boolean vowel(char c){
         return c == 'a' || c == 'e' || c == 'i' 
            || c == 'o' || c == 'u';
    }
}
