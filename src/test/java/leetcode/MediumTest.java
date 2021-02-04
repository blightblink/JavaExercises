package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumTest {

    @Test
    void maxProduct() {
        int[] nums = {1,-5,7,0,7,3,4,-2,-8};
        assertEquals(21,Medium.maxProduct(nums));

        int[] nums2 = {1,-5,7,0,7,3,4,-2,-8,-3};
        assertEquals(24,Medium.maxProduct(nums2));
    }
}
