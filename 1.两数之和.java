/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (47.56%)
 * Likes:    7684
 * Dislikes: 0
 * Total Accepted:    830.3K
 * Total Submissions: 1.7M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // if (nums.length<2) {
        //     return null;
        // }

        // int[] result = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[j]+nums[i]==target) {
        //             result[0]=i;
        //             result[1]=j;
        //             return result;
        //         }
        //     }
        // }
        // return null;

       
    
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
        

        

    }
}
// @lc code=end

//hashmap 储存了一个值和一个索引值
//containsKey相当于节省了一次查找操作
//在查找On2的方法中可以尝试用这个代替 缩小时间复杂度
//返回一个临时数组 return new int[2]; return new int[]{2,4};

//原因 做的题少导致的对一些方法和常用类不熟悉