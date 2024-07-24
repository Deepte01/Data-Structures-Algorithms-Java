package ArraysAndStrings;

public class NumSubArrayProductLessThanK {
   static int numSubArray(int target, int [] nums)
   {
      if(target <= 1)
      {
        return 0;
      }
      int left = 0;
      int cur =1;
      int ans = 0;

      for(int right = 0; right < nums.length; right++){
        cur *= nums[right];
        while (cur >= target) {
            cur /= nums[left];
            left += 1;
        }
        ans += right - left +1;
        System.out.println(ans);
      }
      return ans;
   }
   public static void main(String args [])
   {
      System.out.println(numSubArray(100, new int[]{10, 5, 2,6}));
   } 
}