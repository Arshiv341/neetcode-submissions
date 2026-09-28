class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> st=new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(st.containsKey(s.charAt(i))){
                st.put(s.charAt(i),st.get(s.charAt(i))+1);
            }
            else{st.put(s.charAt(i),1);
            }
        }
        HashMap<Character,Integer>tt=new HashMap<>();
        for(int j=0;j<t.length();j++){
            if(tt.containsKey(t.charAt(j))){
                tt.put(t.charAt(j),tt.get(t.charAt(j))+1);
            }
            else{
                tt.put(t.charAt(j),1);
            }
        }
        if(!tt.equals(st)) return false;
        return true;
    }
}
