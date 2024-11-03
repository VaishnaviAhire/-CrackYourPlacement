
import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array first
        Arrays.sort(nums);
        
        // Initialize closestSum to a large value
        int closestSum = nums[0] + nums[1] + nums[2];
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            // Use the two-pointer technique
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // If we find an exact match, return immediately
                if (currentSum == target) {
                    return currentSum;
                }
                
                // Check if the current sum is closer to the target than the previous closest
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // Move the pointers based on comparison
                if (currentSum < target) {
                    left++;  // Increase sum by moving the left pointer
                } else {
                    right--;  // Decrease sum by moving the right pointer
                }
            }
        }
        
        // Return the closest sum found
        return closestSum;
    }
}
