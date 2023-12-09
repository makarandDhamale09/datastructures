package leetCodeQuestions;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are
 * not equal to val.
 *
 * <p>Consider the number of elements in nums which are not equal to val be k, to get accepted, you
 * need to do the following things:
 *
 * <p>Change the array nums such that the first k elements of nums contain the elements which are
 * not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 * <p>Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_] Explanation: Your function should
 * return k = 2, with the first two elements of nums being 2. It does not matter what you leave
 * beyond the returned k (hence they are underscores).
 */
public class RemoveElement {

  public static void main(String[] args) {
    int[] arr = {3, 2, 2, 3};
    int i = removeElement(arr, 3);
    System.out.println(i);
  }

  public static int removeElement(int[] nums, int val) {
    int count =0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        for (int j = i; j < nums.length; j++) {
          if(nums[j]!= val){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            count++;
          }
        }
      }else
        count++;
    }
    return count;
  }
}