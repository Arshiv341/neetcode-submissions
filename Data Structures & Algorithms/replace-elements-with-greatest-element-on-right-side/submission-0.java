class Solution {
    public int[] replaceElements(int[] arr) {
     int i=0;
     int n=arr.length;
     while(i<n-1){
        int j=i+1;
        int max=0;
        while(j<n){
            max=Math.max(max,arr[j]);
            j++;
        }
        arr[i]=max;
        i++;
     }   
     arr[n-1]=-1;
     return arr;
    }
}