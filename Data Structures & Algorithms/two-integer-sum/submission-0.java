class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int first=0;
        int second=-1;
        int n=nums.length;

        for(int i=0;i<n;i++){
            int req=target-nums[i];
            for(int j=i+1;j<n;j++){
                if(req==nums[j]){
                    first=i;
                    second=j;
                    break;
                }
            }
            if(second != -1) break;
        }
        if(first>second){
            int temp=first;
            first=second;
            second=temp;
        }

        int ans[]={first,second};
        return ans;
    }
}