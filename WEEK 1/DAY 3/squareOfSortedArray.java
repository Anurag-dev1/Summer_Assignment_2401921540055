class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            temp = nums[l] * nums[l];
            nums[l] = temp;
            if(l==r)
            break;
            temp = nums[r] * nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        Arrays.sort(nums);
        return nums;
    }
}