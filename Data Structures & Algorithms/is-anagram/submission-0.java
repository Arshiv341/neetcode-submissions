class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> st = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(st.containsKey(s.charAt(i))){
                st.put(s.charAt(i),st.get(s.charAt(i))+1);
            }
            else{
                st.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!st.containsKey(t.charAt(i)) || st.get(t.charAt(i)) == 0) return false;
            st.put(t.charAt(i),st.get(t.charAt(i))-1);
        }
        return true;
    }
}
