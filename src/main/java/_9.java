package main.java;

public class _9 {
    public boolean isPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.

        if(x<0 || (x%10 == 0 && x!=0))
            return false;
        int reverseHalf=0;
        int n=x;
        while(n>reverseHalf){
            reverseHalf=reverseHalf*10+n%10;
            n=n/10;

        }

        return n==reverseHalf || n==reverseHalf/10; //see comment below
    }
}

/*
 x == rev / 10 is for odd number of digits. Suppose number is 45654, now it will come out of loop when
 x < rev i.e. x = 45 and rev = 456, so to truncate the 6 of res, we use x = rev / 10. But this is not the case of even digits.
  Suppose number is 456654, it will come out of loop when x <= res i.e. x = 456 and rev = 456, so no need to truncate &
  we can use x == rev directly for it.*/
