class Solution {
    public int trap(int[] height) {
        int left=0,maxLeft=0,maxRight=0,maxWater=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<=height[right] ){
                if(maxLeft<height[left]){
                    maxLeft=height[left];
                }
                else if(maxLeft>height[left]){
                    maxWater+=maxLeft-height[left];
                }
                left++;
            }
            else if(height[right]<height[left]){
                if(maxRight<height[right]){
                    maxRight=height[right];
                }
                else if(maxRight>height[right]){
                    maxWater+=maxRight-height[right];
                }
                right--;
            }

        }
        return maxWater;

    }
}