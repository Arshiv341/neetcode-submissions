class Solution {
    public int[] productExceptSelf(int[] nums) {
        //count zero and trake ind
        int zero =0;
        int idx=-1;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
                idx=i;
            }
            else{
                prod*=nums[i];
            }
        }
        int[]arr=new int[nums.length];
        Arrays.fill(arr,0);
        if(zero==0){
            for(int i=0;i<nums.length;i++){
                arr[i]=prod/nums[i];
            }
        }
        else if(zero==1){
            arr[idx]=prod;
        }
        return arr;
    }
}  
