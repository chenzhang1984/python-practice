//2020.2.19 算法题：删除排序数组中的重复项（java代码）
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > nums[j - 1])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
