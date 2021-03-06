class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt("MDCCCLXXXIV"));
    }

    public static int romanToInt(String s) {
        int number = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M':
                    number += 1000;
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'C':
                    number += 100 * (number >= 500 ? -1 : 1);
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'X':
                    number += 10 * (number >= 50 ? -1 : 1);
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'I':
                    number += 1 * (number >= 5 ? -1 : 1);
                    break;
                default:
                    break;
            }
        }

        return number;
    }
}
