import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Step 1: Merge the arrays
        int[] temp = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, temp, 0, nums1.length);
        System.arraycopy(nums2, 0, temp, nums1.length, nums2.length);
        
        // Step 2: Sort the merged array
        Arrays.sort(temp);
        
        // Step 3: Find the median
        int n = temp.length;
        if (n % 2 == 1) {
            // Odd length - take the middle element
            return temp[n / 2];
        } else {
            // Even length - average the two middle elements
            return (temp[(n / 2) - 1] + temp[n / 2]) / 2.0;
        }
    }
}
