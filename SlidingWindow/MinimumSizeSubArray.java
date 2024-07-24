package SlidingWindow;

public class MinimumSizeSubArray {
    /*
     * Leet code question:
     * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
        subarray
        whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

        

        Example 1:

        Input: target = 7, nums = [2,3,1,2,4,3]
        Output: 2
        Explanation: The subarray [4,3] has the minimal length under the problem constraint.
        Example 2:

        Input: target = 4, nums = [1,4,4]
        Output: 1
        Example 3:

        Input: target = 11, nums = [1,1,1,1,1,1,1,1]
        Output: 0
        

        Constraints:

        1 <= target <= 109
        1 <= nums.length <= 105
        1 <= nums[i] <= 104
     */
    static int find_length(int target, int [] nums)
    {
        int left = 0;
        int minArrayLength = Integer.MAX_VALUE;
        int curSum = 0;

        for(int right=0; right< nums.length; right++) {
            curSum += nums[right];            
            while(curSum >= target)
            {
                int value = right-left+1;
                minArrayLength = Math.min(minArrayLength, value);
                curSum -= nums[left];
                left++;
            }
        }

        return minArrayLength > nums.length ? 0: minArrayLength;
    }

    public static void main(String args[])
    {
      var length =find_length(11, new int[]{1,2,3,4,5});
      System.out.println(length);
    }

}
