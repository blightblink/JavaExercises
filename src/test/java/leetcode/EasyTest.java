package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EasyTest {

    @Test
    void reverse() {
        assertEquals(0,Easy.reverse(0));
        assertEquals(123,Easy.reverse(321));
        assertEquals(-456,Easy.reverse(-654));
        assertEquals( -1067, Easy.reverse(-76010));

    }

    @Test
    void ispalindrom(){
        assertTrue(Easy.isPalindrome("abc cba"));
        assertTrue(Easy.isPalindrome("3"));
        assertFalse(Easy.isPalindrome("abc , 3 cba"));
        assertTrue(Easy.isPalindrome("abc , 212 , cba"));
    }


    @Test
    void findDisappearedNumbers() {
        List<Integer> temp = new ArrayList<>();
        temp.add(3);
        temp.add(6);
        int[] nums = {4,5,1,2,2,1};
        assertEquals(temp,Easy.findDisappearedNumbers(nums));
    }
}
