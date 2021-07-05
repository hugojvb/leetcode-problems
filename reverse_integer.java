class Solution {

    public static int reverse(int x) {
        if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) return 0;

        int reversed = invert(Math.abs(x));
        
        if(x < 0) return reversed * -1;
        
        return reversed;        
    }

    public static int invert(int y) {
        int reversed = 0;

        while(y != 0) {
            int temp = y % 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            reversed = reversed * 10 + temp;
            y /= 10;
        }

        return reversed;
    }
}