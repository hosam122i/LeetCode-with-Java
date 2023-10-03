/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/
class Solution {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        String s2 = "";
            for (int i = s1.length() - 1; i >= 0; i--) {
                s2+=s1.charAt(i);
                System.out.println(s1.charAt(i));
            }
        return s1.equals(s2);
    }
}
