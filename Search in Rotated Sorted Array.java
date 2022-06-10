import java.util.*;
public class Solution {
    public static int search(int nums[], int key) {
  int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= key && key <= nums[mid]) {
                    end = mid - 1;
                } else { 
                    start = mid + 1;
                }
            } 
            else {
                if (nums[mid] <= key && key <= nums[end]) {
                    start = mid + 1;
                } else { 
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
