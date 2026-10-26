class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer>set=new HashSet<>();
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int max=0;
        for(int num :set){
            if(!set.contains(num-1)){
                int curr=num;
                int  count=1;
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
