package leetCodeQuestions;

import java.util.Arrays;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find
 * two numbers such that they add up to a specific target number. Let these two numbers be
 * numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * <p>Return the indices of the two numbers, index1 and index2, added by one as an integer array
 * [index1, index2] of length 2.
 *
 * <p>The tests are generated such that there is exactly one solution. You may not use the same
 * element twice.
 *
 * <p>Your solution must use only constant extra space.
 *
 * <p>Input: numbers = [2,7,11,15], target = 9 Output: [1,2] Explanation: The sum of 2 and 7 is 9.
 * Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
public class TwoSum2 {
  public static void main(String[] args) {
    int[] nums = {1, 3, 4, 5, 7, 11};
    int[] ans = twoSum(nums, 9);
    System.out.println(Arrays.toString(ans));
  }

  public static int[] twoSum(int[] nums, int target) {
    int l = 0, r = nums.length - 1;
    while (l < r) {
      if (nums[l] + nums[r] > target) {
        r--;
      } else if (nums[l] + nums[r] < target) {
        l++;
      } else {
        return new int[] {++l, ++r};
      }
    }
    return null;
  }
}
