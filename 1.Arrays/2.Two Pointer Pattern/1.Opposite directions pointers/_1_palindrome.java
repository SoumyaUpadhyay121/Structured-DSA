import java.util.Scanner;

public class _1_palindrome {
    public static void main(String[] args) {
        // Description
        // Check whether a string is a palindrome.
        // Sample Input
        // madam
        // Sample Output
        // Yes
        // Hint
        // Compare characters from both ends.

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,r=s.length()-1;
        String ans="YES";
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                ans="NO";
                break;
            }
            l++;
            r--;
        }
        System.out.print(ans);
    }
}
