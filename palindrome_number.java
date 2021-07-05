class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        if(reverseNumber(x) == x) return true;
        
        return false;
    }

    public static int reverseNumber(int y) {
        int reversed = 0;

        while(y != 0) {
            int temp = y % 10;
            reversed = reversed * 10 + temp; 
            y= y/10;
        }

        return reversed;
    }   
}