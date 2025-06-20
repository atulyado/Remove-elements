class Solution {
    public int removeElement(int[] nums, int val) {//nums = 1234  val = 2
        int k =0;
        for(int i=0;i<nums.length;i++){//go through nums
            if(nums[i] != val){//if nums is not equal 2 
            nums[k] = nums[i];//it storage every nums not equal to 2 and add 1 to k
        k++;
            }
        }
        return k;
    }
}
