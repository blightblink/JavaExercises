package leetcode;

public class Medium {

    /**Test 152
     * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
     */
    public static int maxProduct(int[] nums) {
        int length = nums.length;
        int product;
        int maxproduct = nums[0] * nums[1];
        for(int i =0 ; i< length -1 ; i++){
            product = nums[i] * nums[i+1];
            if( product > maxproduct){
                maxproduct = product;
            }
        }
        return maxproduct;

    }

}
