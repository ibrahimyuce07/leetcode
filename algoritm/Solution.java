public class Solution {

    public static int search(int[] nums, int target) {
        int lowest = 0;
        int highest = nums.length - 1;

        while (lowest <= highest) {
            int mid = (lowest + highest) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                lowest = mid + 1;
            } else {
                highest = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
