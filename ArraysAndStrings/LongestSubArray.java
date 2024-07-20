package ArraysAndStrings;

/*
 * given an array of length n, find the longest subarray
 * such that the sum of sub array is less than or equal to 8
 */

class LongestSubArray{
    static int findLength(int[] nums, int k) {
        int left= 0;
        int curr = 0;
        int ans= 0;
        for(int right=0; right < nums.length; right++) {
           curr += nums[right];
           while (curr > k) {
              //remove the left most numbers
              curr -= nums[left];
              left ++;
           }

           ans = Math.max(ans, right - left +1);
        }
        return ans;
    }

    public static void main(String args[])
    {
        int []arr = new int[]{1,2,7,4,2,1,1,5};
        int max = 8;
        int ans = findLength(arr, max);
        System.out.println(ans);
    }
}