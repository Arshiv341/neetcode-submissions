class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        int max= Integer.MIN_VALUE;
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                int old=max;
                max=Math.max(max,map.get(nums[i]));
                if(old!=max){
                    val=nums[i];
                }
            }
            else{
                map.put(nums[i],1);
            }
        }
        return val;
    }
}