package ArraysAndStrings;

public class RemoveElement {
    static int removeElement(int[] nums, int val) 
    {
      int i = 0;
      for(int j = 0; j < nums.length; j++)
      {
        if (nums[j] != val) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          i++;
        }
      }
      for (int k : nums) {
        System.out.print(k);
      }
      return i;
    }
    public static void main(String args[])
    {
        System.out.println(removeElement(new int[]{4,5}, 4));  
    }
}
