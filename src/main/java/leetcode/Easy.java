package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Easy {

    /**Test 7
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0
     */
    public static Integer reverse(Integer x) {
        String temp = x.toString();
        boolean sign = temp.startsWith("-");
        if(x == 0){
            return x;
        }

        StringBuilder b = new StringBuilder();
        b.append(temp.substring( sign ? 1 : 0, temp.length()));
        b.reverse();
        temp = b.toString();
        while (temp.startsWith("0")) {
            temp = temp.replaceFirst("0","");
        }
        if(sign){
            temp = "-" + temp;
        }

        Long vv = Long.parseLong(temp);
        if(( vv > Math.pow(2,31) - 1) || (vv < (-1) * Math.pow(2,31))){
            return 0;
        }

        return Integer.parseInt(temp);
    }

    /**Test 125
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     */
    public static boolean isPalindrome(String s) {
        if(s.equals("")){
            return true;
        }

        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        String s2 = builder.toString();

        return s2.equals(s);
    }

    /**Test 448
     * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     * Find all the elements of [1, n] inclusive that do not appear in this array.
     * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int i =0 ; i<nums.length; i++){
            int b = nums[nums[i]-1];
            nums[nums[i]-1] = nums[i];
            nums[i] = b;

        }

        for(int i =0 ; i<nums.length; i++){
            if(nums[i] != i+1){
                temp.add(i+1);
            }
        }
        return temp;
    }



}
