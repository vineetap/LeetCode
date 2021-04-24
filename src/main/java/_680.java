package main.java;

public class _680 {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
                return isPalindrome(s.substring(left+1,right+1)) || isPalindrome(s.substring(left,right));
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
