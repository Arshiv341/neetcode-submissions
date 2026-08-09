class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
               map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        HashMap<Character,Integer> st = new HashMap<>();
        for(int i =0; i<t.length();i++){
            if(!st.containsKey(t.charAt(i))){
                st.put(t.charAt(i),1);
            }else{
                st.put(t.charAt(i), st.get(t.charAt(i)) + 1);
            }
        }
       if(!st.equals(map)) return false;
       return true;
    }
}
