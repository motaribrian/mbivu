/*

    Given an array nums containing n distinct numbers in the range [0, n],
     return the only number in the range that is missing from the array.
*/


/*Solution
* I added the factorial of n and called it total
* Added sum of all nums ie nums[0]+...nums[n-1] called it sum
* return difference of the two ie total-sum;
*
* */

package org.codewithmotari;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        MissingNumber m = new MissingNumber();
        int missing=m.missingNumber(new int[]{1,2,3,4,0,5});
        System.out.println(missing);

    }
}