package ArraysAndStrings;

public class MergeTwoSortedArrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = m-1;
      int j = n-1;
      int k = m+n-1;

      while (j >= 0) {
        if(i >= 0 && nums1[i] > nums2[j])
        {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        else if(nums2[j] > nums1[i]){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
      }
      for (int z : nums1) {
        System.out.println(z);
      }
    }
    public static void main(String args[])
    {
        merge(new int[]{1,3,4,0,0,0}, 3,  new int[]{2,5,6}, 3);
    }
}
