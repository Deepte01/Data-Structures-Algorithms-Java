package ArraysAndStrings;

public class RemoveAtMostTwiceDuplicates {
    /*
            * Example 1:

        Input: nums = [1,1,1,2,2,3]
        Output: 5, nums = [1,1,2,2,3,_]
        Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
        It does not matter what you leave beyond the returned k (hence they are underscores).
        Example 2:

        Input: nums = [0,0,1,1,1,1,2,3,3]
        Output: 7, nums = [0,0,1,1,2,3,3,_,_]
        Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
        It does not matter what you leave beyond the returned k (hence they are underscores).

     */
    static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }

        int j = 2;
        for(int i=2; i<n; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                System.out.println("j: " + (j-2));
                j++;
                for(int k : nums){
                    System.out.print(k);
                }
            }
            System.out.println("\n");
        }
        return j;
    }
    public static void main(String args[])
    {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,2,3,3}));  
    }
}
