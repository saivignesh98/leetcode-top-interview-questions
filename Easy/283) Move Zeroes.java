/*
Problem Description:
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int l=0,r=0;
        while(r<len){
            if(nums[r]!=0){
                if(nums[l]==0){
                    int temp=nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
                    l++;
                }
                else
                    l++;
            }
            r++;
        }
    }
}