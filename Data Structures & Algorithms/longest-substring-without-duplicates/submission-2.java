class Solution {
    public int lengthOfLongestSubstring(String s) {
        int winstart=0;
        int winend=0;
        int n=s.length();
        if(n==0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        int len=0;
        while(winend<n){
            char ch=s.charAt(winend);
            if(map.containsKey(ch) &&map.get(ch)>=winstart){
                winstart=map.get(ch)+1;
            }
            map.put(ch,winend);
            max=Math.max(max,winend-winstart+1);
            winend++;
        }
        return max;
    }
}
