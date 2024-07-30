package ArraysAndStrings;

public class MergeTwoSortedArrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int numsindex = 0;
        int finalArray[] = new int[nums1.length];
        for(int i=0; i< nums1.length; i++)
        {
           if(numsindex == m && index < n)
           {
              System.out.println("inside if: numsIndex: " + numsindex + " m: " +m+ " index: " + index+" n: " +n);
              finalArray[i] = nums2[index];
              index++;
           }
           if(index == n && numsindex < m)
           {
              System.out.println("inside if else: numsIndex: " + numsindex + " m: " +m+ " index: " + index+" n: " +n);
              finalArray[i] = nums1[numsindex];
              numsindex++;
           }
           if(nums1[numsindex] > nums2[index])
           {
              finalArray[i] = nums2[index];
              index++;
           }
           else if(nums1[numsindex] <= nums2[index])
           {
              finalArray[i] = nums1[numsindex];
              numsindex++;
           }
        }
        nums1 = finalArray;
        for (int i : finalArray) {
            System.out.println(i);
        }
       // System.out.println(nums1);
    }
    public static void main(String args[])
    {
        merge(new int[]{1,3,4,0,0,0}, 3,  new int[]{2,5,6}, 3);
    }
}
